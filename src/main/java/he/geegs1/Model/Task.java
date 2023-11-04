package he.geegs1.Model;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    @Column (length = 100)
    String title;
    String description;
    @Column(columnDefinition = "false")
    boolean completed;
}
