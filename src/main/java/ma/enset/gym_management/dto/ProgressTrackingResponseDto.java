package ma.enset.gym_management.dto;

import lombok.*;
import ma.enset.gym_management.enums.ProgramObjective;

import java.time.LocalDate;

@AllArgsConstructor @NoArgsConstructor
@Builder
@Getter @Setter
public class ProgressTrackingResponseDto {
    private Long id;
    private LocalDate date;
    private double poids;
    private ProgramObjective objective;
    private Long adherentId;
    private String adherentEmail;
}
