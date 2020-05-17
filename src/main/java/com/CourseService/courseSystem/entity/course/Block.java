package com.CourseService.courseSystem.entity.course;


import com.CourseService.courseSystem.entity.course.Activity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Block {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToMany
//    private Course course;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
