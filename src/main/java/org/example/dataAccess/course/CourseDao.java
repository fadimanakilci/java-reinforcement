package org.example.dataAccess.course;

import org.example.entities.course.Course;

import java.util.List;

public interface CourseDao {
    void add(Course course);

    List<Course> fetch();
}
