package com.restapi.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        List<Course> course = new ArrayList<>();
        courseRepository.findAll().forEach(course:: add);
        return course;
    }

    public List<Course> getAllCourses(String id) {
        List<Course> course = new ArrayList<>();
        courseRepository.findCourseByTopics(id).forEach(course:: add);
        return course;
    }

    public Optional<Course> getCourse(String id) {
        return courseRepository.findById(id);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(String id, Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {

    }
}
