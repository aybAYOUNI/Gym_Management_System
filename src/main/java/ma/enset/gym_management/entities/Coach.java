package ma.enset.gym_management.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.SuperBuilder;
import ma.enset.gym_management.enums.Role;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Getter @Setter @SuperBuilder

@DiscriminatorValue("COACH")

public class Coach extends User {

    @Column(name = "specialite")
    private String specialite;

    @OneToMany(mappedBy = "coach" , fetch = FetchType.LAZY)
    private Collection<CoachingSession> coachingSessions = new ArrayList<>();

    @OneToMany(mappedBy = "coach" , fetch = FetchType.LAZY)
    private Collection<Program> programs = new ArrayList<>();

    public Coach(Long id, String nom, String firstName, String email, String password, Role role, String specialite, Collection<CoachingSession> coachingSessions, Collection<Program> programs) {
        super(id, nom, firstName, email, password, role);
        this.specialite = specialite;
        this.coachingSessions = coachingSessions;
        this.programs = programs;
    }

    public Coach(String specialite, Collection<CoachingSession> coachingSessions, Collection<Program> programs) {
        this.specialite = specialite;
        this.coachingSessions = coachingSessions;
        this.programs = programs;
    }

    public Coach(){
        this.setRole(Role.COACH);
    }

}
