package server.wekick.match.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import server.wekick.match.repository.MatchRepository;

@Service
@RequiredArgsConstructor
public class MatchService {

    private final MatchRepository matchRepository;
}
