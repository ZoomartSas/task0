package he.geegs1.Service.Impl;
import he.geegs1.Model.Task;
import he.geegs1.Repo.TaskRepo;
import he.geegs1.Service.TaskSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl  implements TaskSer {

    private final TaskRepo taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepo taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional <Task> getTaskById(Long taskId) {
        return taskRepository.findById(taskId);
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Optional<Task> updateTask(Long taskId, Task updatedTask) {
        Optional<Task> existingTask = taskRepository.findById(taskId);

        if (existingTask.isPresent()) {
            Task taskToUpdate = existingTask.get();
            taskToUpdate.setTitle(updatedTask.getTitle());
            taskToUpdate.setDescription(updatedTask.getDescription());
            taskToUpdate.setCompleted(updatedTask.isCompleted());

            return Optional.of(taskRepository.save(taskToUpdate));
        } else {
            return Optional.empty();
        }
    }

    public boolean deleteTask(Long taskId) {
        Optional<Task> existingTask = taskRepository.findById(taskId);

        if (existingTask.isPresent()) {
            taskRepository.deleteById(taskId);
            return true;
        } else {
            return false;
        }
    }


}
