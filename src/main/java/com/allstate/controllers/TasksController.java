package com.allstate.controllers;

import com.allstate.models.Task;
import com.allstate.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/tasks"})
public class TasksController {

    @Autowired
    private TaskRepository taskRepository;

    public void setTaskRepository(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @RequestMapping(path = {"", "/"},
            method = RequestMethod.GET)
    public Iterable<Task> index() {
        PageRequest pageRequest = new PageRequest(0, 3);
        return taskRepository.findAll(pageRequest);
    }

    @RequestMapping(path = {"/{id}"},
            method = RequestMethod.GET)
    public Task show(@PathVariable int id) {
       return taskRepository.findOne(id);

    }

    @RequestMapping(path = {"", "/"},
            method = RequestMethod.POST)
    public Task create(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @RequestMapping(path = {"/{id}"},
            method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) {
        taskRepository.delete(id);
        return;
    }

    @RequestMapping(path = {"/{id}/complete"},
            method = RequestMethod.PATCH)
    public Task toggleCompleted(@PathVariable int id) {
        Task task = taskRepository.findOne(id);
        task.setIsComplete(!task.getIsComplete());
        return taskRepository.save(task);
    }
}
