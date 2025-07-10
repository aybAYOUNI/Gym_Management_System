package ma.enset.gym_management.web;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.Valid;
import ma.enset.gym_management.dto.RegistrationProgramResponseDto;
import ma.enset.gym_management.exceptions.*;
import ma.enset.gym_management.services.RegistrationProgramService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
@Validated
@RestController
@RequestMapping("/api/registrationProgram")
@CrossOrigin("*")

public class RegistrationProgramRestController {
    RegistrationProgramService registrationProgramService;


    public RegistrationProgramRestController(RegistrationProgramService registrationProgramService) {
        this.registrationProgramService = registrationProgramService;

    }

    @GetMapping
    public ResponseEntity<List<RegistrationProgramResponseDto>> allRegistrationProgram(){
        return ResponseEntity.ok(registrationProgramService.AllRegistrations());
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<RegistrationProgramResponseDto> getRegistrationById(@PathVariable Long id) throws RegistrationProgramIdNotFoundException {
        return ResponseEntity.ok(registrationProgramService.getRegistrationsById(id));
    }
    @GetMapping(path = "/registrationDate")
    public ResponseEntity<RegistrationProgramResponseDto> getRegistrationByDate(@RequestParam @DateTimeFormat(pattern = "dd.MM.yyyy HH:mm:ss")  LocalDateTime date) throws RegistrationProgramDateNotFoundException {
        return ResponseEntity.ok(registrationProgramService.getRegistrationByRegisteredAt(date));
    }
    @GetMapping(path = "/registrationOfAdherent/{adherentId}")
    public ResponseEntity<List<RegistrationProgramResponseDto>> getRegistrationOfAdherent(@PathVariable Long adherentId) throws AdherentIdNotFoundException, RegistrationOfAdherentNotFoundException {
        return ResponseEntity.ok(registrationProgramService.getRegistrationByAdherent(adherentId));
    }
    @GetMapping(path = "/registrationOfProgram/{programId}")
    public ResponseEntity<List<RegistrationProgramResponseDto>> getRegistrationOfProgram(@PathVariable Long programId) throws ProgramIdNotFoundException, RegistrationOfProgramtNotFoundException {
        return ResponseEntity.ok(registrationProgramService.getRegistrationByProgram(programId));
    }
    @PostMapping(path = "/registration")
    public ResponseEntity<RegistrationProgramResponseDto> registrationInProgram(@Valid @RequestParam String adherentDtoUserName, @RequestParam String programDtoName) throws ProgramNameNotFoundException, AdherentEmailNotFoundException {

        return ResponseEntity.ok(registrationProgramService.registrationInProgram(adherentDtoUserName,programDtoName));
    }
    @DeleteMapping(path = "/deleteRegistraion/{id}")
    public ResponseEntity<String> deleteRegistration(@PathVariable long id){
        registrationProgramService.deleteRegistration(id);
        return ResponseEntity.ok("l'inscription est supprimé");
    }


}
