package ma.enset.gym_management.auth;

import lombok.*;

@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class AuthenticationResponse {

    private String token;
}
