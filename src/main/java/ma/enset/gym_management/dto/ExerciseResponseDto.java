package ma.enset.gym_management.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.enset.gym_management.enums.ExerciseCategorie;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ExerciseResponseDto {

    private String nom;

    private String description;

    private int repetitions;

    private int series;

    private ExerciseCategorie categorie;

    private String image_exercise;
}
