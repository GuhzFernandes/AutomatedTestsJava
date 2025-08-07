package edu.gus.courses;


import edu.gus.courses.services.CourseService;

import java.util.ArrayList;
import java.util.List;

//SUT
public class CourseBusiness {

    // CourseService is a Dependency
    private CourseService service;

    public CourseBusiness(CourseService service) {
        this.service = service;
    }

    public List<String> retriveCoursesRelatedToSpring(String student) {

        var filteredCourses = new ArrayList<String>();
        var allCourses = service.retrieveCourses(student);

        for (String course : allCourses) {
            if (course.contains("Spring")) filteredCourses.add(course);
        }
        return filteredCourses;
    }
}
