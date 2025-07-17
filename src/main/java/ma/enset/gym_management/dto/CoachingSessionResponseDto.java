package ma.enset.gym_management.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import ma.enset.gym_management.entities.Adherent;
import ma.enset.gym_management.entities.Coach;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CoachingSessionResponseDto{

    private Long id;

    @JsonFormat(pattern = "dd.MM.yyyy HH:mm:ss")
    private LocalDateTime dateInscriptionSession;

    private boolean statute= false;

    private AdherentDto adherent;

    private CoachDto coach;
}
