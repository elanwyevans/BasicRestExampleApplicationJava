package com.example.basicrestattempt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentDTOService
{
    @Autowired
    private StudentRepository studentRepository;

    private StudentDTO convertToStudentDTO(Student student)
    {
        StudentDTO sDTO = new StudentDTO();
        sDTO.setStudentid(student.getId());
        sDTO.setName(student.getName());
        sDTO.setAddress(student.getAddress());
        sDTO.setDob(student.getDob());
        sDTO.setShortcode(student.getCourse().getDegreetype().getShortcode());
        sDTO.setCoursename(student.getCourse().getCoursename().getCoursename());

        return sDTO;
    }

    //return all students in the StudentDTO format
    public List<StudentDTO> getAllStudentsDTO()
    {
        //'return ((List<Student>)studentRepository.findAll())' gets all students, puts them in a list of students
        //casts each of the returned elements into a list of Students
        //'.map(this::convertToStudentDTO)' goes through list of Students and coverts them into StudentDTO format
        //'.collect (Collectors.toList())' puts the newly converted StudentDTOs into a list
        return ((List<Student>)studentRepository.findAll()).stream().map(this::convertToStudentDTO).collect(Collectors.toList());
    }

    //return a single student by ID
    public StudentDTO getStudentDTOById(int id)
    {
        List<StudentDTO> studentDTOList = getAllStudentsDTO();

        for(StudentDTO sDTO : studentDTOList)
        {
            if(sDTO.getStudentid() == id)
            {
                return sDTO;
            }
        }
        return null;
    }
}
