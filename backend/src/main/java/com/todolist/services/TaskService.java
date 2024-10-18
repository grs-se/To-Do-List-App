package com.todolist.services;

import com.todolist.models.TaskModel;
import com.todolist.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public TaskModel createTask(TaskModel taskModel) {
        return taskRepository.save(taskModel);
    }

    public List<TaskModel> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<TaskModel> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    public TaskModel updateTask(Long id, TaskModel taskModel) {
        TaskModel task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        task.setDescription(taskModel.getDescription());
        task.setDueDate(taskModel.getDueDate());
        task.setCompleted(taskModel.isCompleted());

        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
