package org.example.business.course;

import org.example.dataAccess.course.CourseDao;
import org.example.entities.course.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private List<CourseControlManager> courseControlManagers;
    private List<Course> courses = new ArrayList<Course>();

    public CourseManager(CourseDao courseDao, List<CourseControlManager> courseControlManagers) {
        this.courseDao = courseDao;
        this.courseControlManagers = courseControlManagers;
    }

    public void add(Course course) throws Exception {
        courses.addAll(courseDao.fetch());
        for (CourseControlManager courseControlManager : courseControlManagers){
            boolean isEqual = courseControlManager.isEqual(course.getName(), courses);
            if (isEqual) {
                throw new Exception("Kurs kayıtlı! Farklı kurs ekleyin!");
            } else {
                courseDao.add(course);
            }
        }
    }
}
