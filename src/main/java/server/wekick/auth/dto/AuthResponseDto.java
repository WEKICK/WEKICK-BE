package server.wekick.auth.dto;

import lombok.Getter;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AuthResponseDto {
    @Getter
    public class logintDto {
        private String accessToken;
        private String refreshToken;
        private Long expiresIn;
    }
}
