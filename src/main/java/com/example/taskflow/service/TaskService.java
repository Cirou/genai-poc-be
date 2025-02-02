package com.example.taskflow.service;

import org.springframework.stereotype.Service;

@Service
public class TaskService {

    public String getTasks() {
        return "Returning tasks from service";
    }
}
