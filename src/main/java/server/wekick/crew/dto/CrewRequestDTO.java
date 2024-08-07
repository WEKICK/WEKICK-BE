package server.wekick.crew.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CrewRequestDTO {

    @Getter
    public static class createCrew {
        @NotNull(message = "크루명을 입력해주세요.")
        private String crewName;

        private String crewBio;
    }
}
