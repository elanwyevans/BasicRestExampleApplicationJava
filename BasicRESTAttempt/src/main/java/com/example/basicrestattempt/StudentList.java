package com.example.basicrestattempt;

import java.util.ArrayList;
import java.util.List;

//singleton design pattern
public class StudentList
{
    //can't be instantiated outside this class and can only be
    //instantiated once inside the class
    private static StudentList inst = null;
    private List<Student> stList;

    //constructor
    private StudentList()
    {
        stList = new ArrayList<>();
    }

    public static StudentList getInstance()
    {
        if (inst == null)
        {
            //can be instantiated once inside class
            inst = new StudentList();
        }
        return inst;
    }

    public void AddStudent(Student s)
    {
        stList.add(s);
    }

    public Student GetStudent(int id)
    {
        if(stList.size() <= id || id < 0)
        {
            //if student doesn't exist
            return null;
        }
        return stList.get(id);
    }

    public List<Student> GetStudentList()
    {
        return stList;
    }
}
