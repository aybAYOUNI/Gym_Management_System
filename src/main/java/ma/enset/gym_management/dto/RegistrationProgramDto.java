package ma.enset.gym_management.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RegistrationProgramDto {

    @JsonFormat(pattern = "dd.MM.yyyy HH:mm:ss")
    private LocalDateTime registeredAt;

    private AdherentDto adherent;
    private ProgramDto programs;

}
