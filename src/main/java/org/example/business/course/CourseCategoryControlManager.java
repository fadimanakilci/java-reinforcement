package org.example.business.course;

import org.example.entities.course.Course;

import java.util.List;

public class CourseCategoryControlManager implements CourseControlManager {
    private boolean finded = false;

    @Override
    public boolean isEqual(String value, List<Course> courses) {
        // TODO: Buraya eklenen kategori id sinin olup olmadığının kontrolünü ekle!!!
        return false;
    }
}
