package com.example.basicrestattempt;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Coursename implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int coursenameid;
    private String coursename;


    //must handle the opposite way too
    //Course.class refers to the class it has the 1:M relationship with
    //one course name can have many courses (target entity = the entity it's being compared to)
    @OneToMany(fetch = FetchType.LAZY, targetEntity = Course.class, mappedBy = "coursename")
    //many courses so list is a good structure
    private List<Course> coursenames;

    public Coursename() {

    }

    public Coursename(String coursename) {
        this.coursename = coursename;
    }

    public int getCoursenameid() {
        return coursenameid;
    }

    public void setCoursenameid(int coursenameid) {
        this.coursenameid = coursenameid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public List<Course> getCoursenames() {
        return coursenames;
    }

    public void setCoursenames(List<Course> coursenames) {
        this.coursenames = coursenames;
    }

}

