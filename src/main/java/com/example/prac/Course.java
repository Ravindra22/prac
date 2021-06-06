package com.example.prac;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class Course {
    @Id
    private long id;
    private String title;
    private String description;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Course(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Course() {
        super();
    }


}
