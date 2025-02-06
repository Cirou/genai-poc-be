```java
package com.example.taskflow.controller;

import com.example.taskflow.dto.TaskDTO;
import com.example.taskflow.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public ResponseEntity<List<TaskDTO>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    @PostMapping
    public ResponseEntity<TaskDTO> createTask(@Valid @RequestBody TaskDTO taskDTO) {
        return ResponseEntity.ok(taskService.createTask(taskDTO));
    }
}
```