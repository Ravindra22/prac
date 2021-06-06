package com.example.prac;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CourseService implements CourseInterface {
    @Autowired
   private CourseDao courseDao;

    public CourseService() {


    }

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();

    }

    @Override
    public Course getCourse(Long courseId) {
        return courseDao.getOne(courseId);

    }

    @Override
    public Course addCourses(Course course) {
       courseDao.save(course);
        return course;

    }

    @Override
    public void deleteCourse(Long courseId) {
       Course entity= courseDao.getOne(courseId);
       courseDao.delete(entity);

    }

}
