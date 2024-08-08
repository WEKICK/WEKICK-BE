package server.wekick.auth.dto;

import lombok.Getter;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AuthRequestDto {
    @Getter
    public class TermsConsentDto {
        private Long memberId;
        private String email;
        private Boolean serviceTerms;
    }
}
