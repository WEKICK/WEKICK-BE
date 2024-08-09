package server.wekick.crewRank.service;

import org.springframework.stereotype.Service;
import server.wekick.crewRank.dto.CrewRankResponse;

@Service
public class CrewRankService {

    public CrewRankResponse getCrewRank(String type){
        CrewRankResponse response = new CrewRankResponse();
        response.setType(type);
        return response;
    }
}
