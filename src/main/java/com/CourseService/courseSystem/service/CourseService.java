package com.CourseService.courseSystem.service;


import com.CourseService.courseSystem.entity.course.Course;
import com.CourseService.courseSystem.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course save(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    public void delete(Long id) {
        courseRepository.deleteById(id);
    }
    public Course findById(Long theId) {

        return courseRepository.getOne(theId);
    }
}
