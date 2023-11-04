package he.geegs1.Repo;

import he.geegs1.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TaskRepo extends JpaRepository<Task,Long> {

}
