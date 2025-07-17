package ma.enset.gym_management.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.enset.gym_management.entities.Program;
import ma.enset.gym_management.enums.ExerciseCategorie;

import java.util.Collection;
import java.util.Date;
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class ExerciseDto {

    private String nom;

    private String description;

    private int repetitions;

    private int series;

    private ExerciseCategorie categorie;

    private String image_exercise;

}
