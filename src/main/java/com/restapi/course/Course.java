package com.restapi.course;

import com.restapi.topic.Topic;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Course {
    @Id
    private String id;

    public Course(String id, String name, String description, List<Topic> topics) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topics = topics;
    }

    private  String name;
    private String description;
    @OneToMany(targetEntity=Topic.class)
    @Size(min=1, message="You must choose at least 1 ingredient")
    @JoinColumn(name = "id", nullable = false, insertable =  false, updatable = false)
    private List<Topic> topics;

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public Course() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
