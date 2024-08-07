package server.wekick.crew.entity;

import jakarta.persistence.*;
import lombok.*;
import server.wekick.common.BaseDateTimeEntity;

import java.util.List;

@Entity
@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Crew extends BaseDateTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String bio;

    private Integer matchCount;

    private Integer winRate;

    private Integer rank;

    private Integer rating;

//    @OneToMany(mappedBy = "crew")
//    private List<Member> memberList;
}
