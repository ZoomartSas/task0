package he.geegs1.Controllers;


import he.geegs1.Model.Task;
import he.geegs1.Service.TaskSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskSer taskService;

    @Autowired
    public TaskController(TaskSer taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/id")
    public Optional<Task> getTaskById(@RequestParam Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping("/cr")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PutMapping("/{id}")
    public Optional<Task> updateTask(@PathVariable Long id, @RequestBody Task updatedTask) {
        return taskService.updateTask(id, updatedTask);
    }

    @DeleteMapping("/{id}")
    public boolean deleteTask(@RequestParam Long id) {
        return taskService.deleteTask(id);
    }
}
