package ma.enset.gym_management.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import ma.enset.gym_management.enums.Sex;

import java.util.ArrayList;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AdherentResponseDTO {
    private Long id;
    private String nom;
    private String firstName;
    private String email;
    private Sex gender ;
    private int age;
    private double poids;
    private String phone;


}
