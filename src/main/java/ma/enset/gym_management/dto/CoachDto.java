package ma.enset.gym_management.dto;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CoachDto {

    @NotNull(message = "Le prénome est obligatoire.")
    @Size(min = 2, message = "Le prénome doit contenir au moins 2 caractères.")
    private String firstName;

    @NotNull(message = "Le nom est obligatoire.")
    @Size(min = 2, message = "Le nom doit contenir au moins 2 caractères.")
    private String nom;

    @NotNull(message = "Le username est obligatoire.")
    @Size(min = 2, message = "Le username doit contenir au moins 2 caractères.")
    private String email;

    @NotNull(message = "mot de passe est obligatoire.")
    @Size(min = 5, message = "mot de passedoit contenir au moins 5 caractères.")
    private String password;

    private String specialite;


}
