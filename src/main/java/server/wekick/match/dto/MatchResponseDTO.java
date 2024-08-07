package server.wekick.match.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MatchResponseDTO {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class getAvailableDateList {
        private List<String> dates;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class applyMatch {
        private Long matchId;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class getMatch {
        private LocalDateTime matchTime; // (YYYY-MM-dd hh:mm)

        private String matchGround;

        private String matchType;

        private Integer playerCount;

        private String matchStatus;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class getMatchList {
        private List<MatchResponseDTO.getMatch> matchList;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class getRecruitingMatchDetails {
        private LocalDateTime matchTime; // (YYYY-MM-dd hh:mm)

        private String matchGround;

        private String matchType;

        private Integer playerCount;

        private String matchStatus;

        private List<String> crewList;

        private Boolean isEquipped;

        private List<PlayerResponseDTO.getPlayer> playerList;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class getReadyMatchDetails {
        private LocalDateTime matchTime; // (YYYY-MM-dd hh:mm)

        private String matchGround;

        private String matchType;

        private Integer playerCount;

        private String matchStatus;

        private List<String> crewList;

        private Boolean isEquipped;

        private List<TeamResponseDTO.getTeam> teamList;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class cancelApplyMatch {
        private Long matchId;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class inviteMatch {
        private String matchUrl;
    }
}
