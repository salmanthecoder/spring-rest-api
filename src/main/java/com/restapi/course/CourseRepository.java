package com.restapi.course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findCourseByTopic(String id);

}
