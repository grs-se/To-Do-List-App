package com.todolist.repositories;

import com.todolist.models.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskModel, Long> {

    //    public void getTasks() {
//
//    }
//
//    public void getTaskById(Long id) {
//
//    }
//
//
//    public void createTask() {
//
//    }
//
//    public void deleteTask() {
//
//    }
}
