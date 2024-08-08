package server.wekick.member.service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import server.wekick.crew.repository.CrewRepository;
import server.wekick.member.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
}
