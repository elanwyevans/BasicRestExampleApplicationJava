package com.example.basicrestattempt;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
//lazy fetch i.e. doesn't return unnecessary data that's linked to the entity
//i.e. only returns what the request asks for, rather than returning everything and
//just not displaying it
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student implements Serializable
{
   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int studentid;
    private String name;
    private String address;
    private LocalDate dob;

    //many students can be on one course
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "course")
    private Course course;

    public Student() {

    }

    public Student(String name, String address, LocalDate dob, Course course) {

        this.name = name;
        this.address = address;
        this.dob = dob;
        this.course = course;
    }

    public Student(String name, String address, String dob, Course course) {

        this.name = name;
        this.address = address;
        this.dob = LocalDate.parse(dob);
        this.course = course;
    }


    public int getId() {
        return studentid;
    }

    public void setId(int id) {
        this.studentid = id;
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

    public void setDob(String dob) {
        setDob(LocalDate.parse(dob));
    }


    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

}

