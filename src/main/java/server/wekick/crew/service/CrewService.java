package server.wekick.crew.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import server.wekick.crew.repository.CrewRepository;

@Service
@RequiredArgsConstructor
public class CrewService {

    private final CrewRepository crewRepository;
}
