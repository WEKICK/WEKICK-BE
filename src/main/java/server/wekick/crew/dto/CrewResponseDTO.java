package server.wekick.crew.dto;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CrewResponseDTO {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class getCrewId {
        private Long crewId;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class inviteCrew {
        private String recruitUrl;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class getCrewDetails {
        private Long crewId;
        private String crewName;
        private String crewBio;
        private Integer matchCount;
        private Integer winRate;
        private Integer rank;
//        private List<MemberResponseDTO.getMember> memberList;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class memberWithdraw {
        private Long memberId;
    }
}
