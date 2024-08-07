package server.wekick.player.entity;

import jakarta.persistence.*;
import lombok.*;
import server.wekick.common.BaseDateTimeEntity;
import server.wekick.crew.entity.Crew;
import server.wekick.match.entity.Match;

@Entity
@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Player extends BaseDateTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @JoinColumn
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Member member;

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY)
    private Match match;

    @JoinColumn(nullable = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private Crew crew;

}
