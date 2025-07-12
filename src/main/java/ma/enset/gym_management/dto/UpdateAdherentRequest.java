package ma.enset.gym_management.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.enset.gym_management.enums.Sex;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateAdherentRequest {
    @NotNull(message = "Le nom est obligatoire.")
    @Size(min = 2, message = "Le nom doit contenir au moins 2 caractères.")
    private String nom;

    @NotNull(message = "Le prénome est obligatoire.")
    @Size(min =2, message = "Le prénome doit contenir au moins 2 caractères.")
    private String firstName;

    @NotNull(message = "Le username est obligatoire.")
    @Size(min = 2, message = "Le username doit contenir au moins 2 caractères.")
    private String email;

    private Sex genre;
    private int age;
    private double poids;
    private String phone;
}
