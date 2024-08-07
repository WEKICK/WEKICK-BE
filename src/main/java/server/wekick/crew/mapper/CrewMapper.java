package server.wekick.crew.mapper;

import server.wekick.crew.entity.Crew;

public class CrewMapper {

    public static Crew toCrew() {
        return Crew.builder()
                .name(null)
                .bio(null)
                .matchCount(0)
                .winRate(0)
                .rank(0)
                .rating(0)
                .build();
    }
}
