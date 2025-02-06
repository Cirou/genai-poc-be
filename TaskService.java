```java
package com.example.taskflow.service;

import com.example.taskflow.dto.TaskDTO;
import com.example.taskflow.model.Task;
import com.example.taskflow.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<TaskDTO> getAllTasks() {
        return taskRepository.findAll().stream()
                .map(Task::toDto)
                .collect(Collectors.toList());
    }

    public TaskDTO createTask(TaskDTO taskDTO) {
        Task task = new Task(taskDTO);
        task = taskRepository.save(task);
        return task.toDto();
    }
}
```