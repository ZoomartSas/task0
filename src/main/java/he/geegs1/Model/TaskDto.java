package he.geegs1.Model;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TaskDto {
    Long id;
    @Column(length = 100)
    String title;
    String description;
    boolean completed;
    LocalDate created = LocalDate.now();
}
