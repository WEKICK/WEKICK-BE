package server.wekick.match.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.wekick.match.entity.Match;

public interface MatchRepository extends JpaRepository<Match, Long> {
}
