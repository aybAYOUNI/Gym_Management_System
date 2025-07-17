package ma.enset.gym_management.dto;

import lombok.*;
import ma.enset.gym_management.enums.ProgramObjective;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProgressTrackingDto {
    private LocalDate date;
    private double poids;
    private ProgramObjective objective;

    private Long adherentId;
}
