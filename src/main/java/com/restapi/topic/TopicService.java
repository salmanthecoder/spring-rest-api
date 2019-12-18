package com.restapi.topic;

import com.restapi.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        List<Topic> topic = new ArrayList<>();
        topicRepository.findAll().forEach(topic:: add);
        return topic;
    }

    public Optional<Topic> getTopic(String id) {
        return topicRepository.findById(id);
    }

    public void addTopic(Topic Topic) {
        topicRepository.save(Topic);
    }

    public void updateTopic(String id, Topic Topic) {
        topicRepository.save(Topic);
    }

    public void deleteTopic(String id) {

    }
}
