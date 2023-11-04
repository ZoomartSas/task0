package he.geegs1.Model;

import jakarta.persistence.Column;
import lombok.*;

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
    @Column(columnDefinition = "false")
    boolean completed;
}
