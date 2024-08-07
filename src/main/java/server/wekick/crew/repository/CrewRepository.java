package server.wekick.crew.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.wekick.crew.entity.Crew;

public interface CrewRepository extends JpaRepository<Crew, Long> {
}
