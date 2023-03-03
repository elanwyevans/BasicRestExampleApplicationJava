package com.example.basicrestattempt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class StudentDetailsRepository
{
    @Autowired
    private StudentDTOService studentDTOService;

    @GetMapping("/studentdetails")
    public List<StudentDTO> getAllStudentDetails()
    {
        return studentDTOService.getAllStudentsDTO();
    }


    //get specific student by id
    //returns 404 error if student doesn't exist
    @GetMapping("/studentdetails/{id}")
    public StudentDTO getStudentByID(@PathVariable("id") int studentId)
    {
        StudentDTO sDTO = studentDTOService.getStudentDTOById(studentId);

        if(sDTO != null)
        {
            return sDTO;
        }
        //otherwise throw a 404 (not found) error
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student ID not found.");
    }
}
