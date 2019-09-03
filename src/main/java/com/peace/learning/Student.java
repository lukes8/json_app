package com.peace.learning;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int age;
    private String name;
    private Subject subject;
    private List<Task> tasks;
    private int id;

    public Student(int age, String name, Subject subject, int id) {
        this.age = age;
        this.name = name;
        this.subject = subject;
        this.tasks = new ArrayList<>();
        this.tasks.add(new Task("Task from nature", "Nature", 0));
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", subject=" + subject +
                ", tasks=" + tasks +
                ", id=" + id +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
