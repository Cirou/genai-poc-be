```java
package com.example.taskflow.model;

import com.example.taskflow.dto.TaskDTO;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private String status;

    public Task() { }

    public Task(TaskDTO taskDTO) {
        this.title = taskDTO.getTitle();
        this.description = taskDTO.getDescription();
        this.status = taskDTO.getStatus();
    }

    public TaskDTO toDto() {
        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setId(this.id);
        taskDTO.setTitle(this.title);
        taskDTO.setDescription(this.description);
        taskDTO.setStatus(this.status);
        return taskDTO;
    }

    // getters and setters...
}
```