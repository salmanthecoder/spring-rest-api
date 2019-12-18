package com.restapi.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;


    @RequestMapping("/courses")
    public List<Course> getAllCourses(@PathVariable String topic) {
        return courseService.getAllCourses(topic);
    }

    @RequestMapping("/courses/{id}")
    public Optional<Course> getCourse(@PathVariable String id) {
        return courseService.getCourse(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/courses")
    public void addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/courses/{id}")
    public void updateCourse(@PathVariable String id, @RequestBody Course course) {
        courseService.updateCourse(id, course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
    public void deleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
    }
}
