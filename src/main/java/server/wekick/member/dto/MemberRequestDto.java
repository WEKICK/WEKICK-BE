package server.wekick.member.dto;

import lombok.Getter;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import server.wekick.member.entity.PreferredStyle;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MemberRequestDto {
    @Getter
    public static class myDetailedInfo {
        private String nickname;
        private Enum sex;
        private PreferredStyle preferredStyle;
        private List<String> skill;
        private Long ranking;
        private Integer rating;
        private Integer matchesParticipated;
        private Integer mannersKingCount;
        private Integer skillKingCount;
        private Integer atmosphereMakerCount;
        private Integer roughPlayerCount;
        private Integer matchesWithRoughPlay;
    }
    public static class onboardingInfo {
        @Getter
        private String nickname;
        private Enum sex;
        private PreferredStyle preferredStyle;
        private List<String> skill;
    }
}
