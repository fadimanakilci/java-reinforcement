package org.example.business.course;

import org.example.entities.course.Course;

import java.util.List;

public interface CourseControlManager {
    boolean isEqual(String value, List<Course> courses);
}
