package com.example.basicrestattempt;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Course implements Serializable
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int courseid;

    //must specify relationships
    //one degree type can have many courses
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "degreetype")
    private Degreetype degreetype;



    //one course name can have many courses?
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coursename")
    private Coursename coursename;

    //one course can have many students
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
    private List<Student> students;

    public Course() {

    }

    public Course(Degreetype degreeType, Coursename coursename) {
        this.degreetype = degreeType;
        this.coursename = coursename;
    }


    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public Degreetype getDegreetype() {
        return degreetype;
    }

    public void setDegreetype(Degreetype degreeType) {
        this.degreetype = degreeType;
    }

    public Coursename getCoursename() {
        return coursename;
    }

    public void setCoursename(Coursename coursename) {
        this.coursename = coursename;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}

