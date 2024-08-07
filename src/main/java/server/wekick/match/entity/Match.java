package server.wekick.match.entity;

import jakarta.persistence.*;
import lombok.*;
import server.wekick.common.BaseDateTimeEntity;

import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Match extends BaseDateTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime matchDate;

    private String matchGround;

    private Integer playerCount;

    @Enumerated(EnumType.STRING)
    private MatchType matchType;

    @Enumerated(EnumType.STRING)
    private MatchStatus matchStatus;


}
