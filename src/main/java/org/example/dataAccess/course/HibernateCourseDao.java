package org.example.dataAccess.course;

import org.example.entities.course.Course;

import java.util.ArrayList;
import java.util.List;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına eklenen course = " + course.getName());
    }

    @Override
    public List<Course> fetch() {
        System.out.println("Hibernate ile veritabanından getirilen courses.");
        //  Veritabanı bağlantısı olmadığı için course listesi oluşturduk
        List<Course> courses = new ArrayList<Course>();
        courses.add(new Course(1, 2, "Course 1", 200));
        courses.add(new Course(2, 1, "Course 2", 400));
        courses.add(new Course(3, 1, "Course 3", 150));

        //  this.categories.addAll(categories);
        return courses;
    }
}
