package org.example.business.course;

import org.example.entities.course.Course;

import java.util.List;

public class CourseNameControlManager implements CourseControlManager {
    private boolean finded = false;
    //  private String name;
    //  private List<Course> courses;

    //  public CourseNameControlManager(String name, List<Course> courses){
    //      this.name = name;
    //      this.courses = courses;
    //  }

    @Override
    public boolean isEqual(String value, List<Course> courses) {
        for (Course course : courses){
            if(course.getName().equals(value)){
                finded = true;
                return finded;
            } else {
                finded = false;
            }
        }
        return finded;
    }
}
