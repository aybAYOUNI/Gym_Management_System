package ma.enset.gym_management.entities;

import jakarta.persistence.*;
import lombok.*;
import ma.enset.gym_management.enums.ProgramObjective;

import java.time.LocalDate;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @Builder
public class ProgressTracking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private double poids;
    private ProgramObjective objective;

    @ManyToOne
    private Adherent adherent;

}
