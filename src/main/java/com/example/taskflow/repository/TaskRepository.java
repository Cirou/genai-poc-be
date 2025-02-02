package com.example.taskflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.taskflow.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
