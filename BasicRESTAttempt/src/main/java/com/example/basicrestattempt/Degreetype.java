package com.example.basicrestattempt;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Degreetype implements Serializable
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int degreetypeid;
    private String typename;
    private String shortcode;

    //one degree can have many courses
    @OneToMany(fetch = FetchType.LAZY, targetEntity = Course.class, mappedBy = "degreetype")
    private List<Course> degreetype;

    public Degreetype() {

    }

    public Degreetype(String typename, String shortcode) {
        this.typename = typename;
        this.shortcode = shortcode;
    }

    public int getDegreetypeid() {
        return degreetypeid;
    }

    public void setDegreetypeid(int degreetypeid) {
        this.degreetypeid = degreetypeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getShortcode() {
        return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    public List<Course> getDegreetype() {
        return degreetype;
    }

    public void setDegreetype(List<Course> degreetype) {
        this.degreetype = degreetype;
    }

}

