package he.geegs1.Controllers;

import he.geegs1.Model.TaskDto;
import he.geegs1.Repo.TaskRepo;
import he.geegs1.Service.TaskSer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/task")


public class TaskController {
    private final TaskSer taskSer;
      private final TaskRepo taskRepo;


    public TaskController(TaskSer taskSer, TaskRepo taskRepo) {
        this.taskSer = taskSer;
        this.taskRepo = taskRepo;
    }
     @PostMapping("/create")
    public ResponseEntity<String> createTask (@RequestBody TaskDto taskDto) {

         try {
             taskSer.saveTask(taskDto);

             return ResponseEntity.status(HttpStatus.CREATED).body("успех ");
         } catch (Exception e) {
             return ResponseEntity.
                     status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ошибка ");
         }
     }
}
