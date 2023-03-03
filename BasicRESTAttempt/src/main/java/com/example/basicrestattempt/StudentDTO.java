package com.example.basicrestattempt;

import java.time.LocalDate;

//Data Transfer Object = collection of data within a HTTP body
//DTOs almost always use get requests
public class StudentDTO
{
    private int studentid;
    private String name;
    private String address;
    private LocalDate dob;
    //keeping shortcode and coursename separate as it's a lot more work
    //to split them up once they've been returned as a single string
    private String shortcode;
    private String coursename;



    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getShortcode() {
        return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }


}
