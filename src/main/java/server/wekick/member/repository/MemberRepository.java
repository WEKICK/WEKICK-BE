package server.wekick.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.wekick.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}