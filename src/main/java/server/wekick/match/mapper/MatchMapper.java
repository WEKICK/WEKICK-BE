package server.wekick.match.mapper;

import server.wekick.match.entity.Match;
import server.wekick.match.entity.MatchStatus;

public class MatchMapper {

    public static Match toMatch() {
        return Match.builder()
                .matchDate(null)
                .matchGround(null)
                .playerCount(null)
                .matchType(null)
                .matchStatus(MatchStatus.RECRUITING)
                .build();
    }
}
