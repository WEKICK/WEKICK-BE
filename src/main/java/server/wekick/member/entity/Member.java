package server.wekick.member.entity;

import jakarta.persistence.*;
import lombok.*;
import server.wekick.common.BaseDateTimeEntity;

import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member extends BaseDateTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickName;

    private String email;

    private boolean isAuthenticated;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Enumerated(EnumType.STRING)
    private StylePreference stylePreference;

    @Enumerated(EnumType.STRING)
    private Skill skill;

    private Integer rank;

    private Integer rating;

    private int matchCount;

    private int mannerKingCount;

    private int skillKingCount;

    private int socialKingCount;

    private int foulKingCount;

    private LocalDateTime inactiveAt;

    private LocalDateTime deleteAt;
}
