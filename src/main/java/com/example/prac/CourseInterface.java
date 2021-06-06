package com.example.prac;

import java.util.List;

public interface CourseInterface {

     List<Course> getCourses();
     Course getCourse(Long courseId);
     Course addCourses(Course course);
     void deleteCourse(Long courseId);


}
