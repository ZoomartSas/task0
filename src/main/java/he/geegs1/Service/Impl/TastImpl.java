package he.geegs1.Service.Impl;

import he.geegs1.Model.Task;
import he.geegs1.Model.TaskDto;
import he.geegs1.Service.TaskSer;
import org.springframework.stereotype.Service;

@Service
public class TastImpl implements TaskSer {
    private final TaskSer taskSer;

    public TastImpl(TaskSer taskSer) {
        this.taskSer = taskSer;
    }

    @Override
    public void saveTask(TaskDto taskDto) {
        Task task = new Task();
        task.setId(taskDto.getId());
        task.setTitle(taskDto.getTitle());
        task.setCompleted(taskDto.isCompleted());
        task.setDescription(taskDto.getDescription());
    }
}
