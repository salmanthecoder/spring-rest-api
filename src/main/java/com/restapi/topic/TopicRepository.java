package com.restapi.topic;

import com.restapi.course.Course;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
