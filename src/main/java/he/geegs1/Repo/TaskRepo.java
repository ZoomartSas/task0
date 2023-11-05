package he.geegs1.Repo;

import he.geegs1.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface TaskRepo extends JpaRepository<Task,Long> {
     Optional<Task> findById (Long id);
}
