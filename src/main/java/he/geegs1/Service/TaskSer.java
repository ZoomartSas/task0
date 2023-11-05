package he.geegs1.Service;

import he.geegs1.Model.Task;
import he.geegs1.Model.TaskDto;

import java.util.List;
import java.util.Optional;

public interface TaskSer {
     List<Task> getAllTasks();
    Optional<Task> getTaskById(Long taskId);
    Task createTask(Task task);
    Optional<Task> updateTask(Long taskId, Task updatedTask);
    boolean deleteTask(Long taskId);
}
