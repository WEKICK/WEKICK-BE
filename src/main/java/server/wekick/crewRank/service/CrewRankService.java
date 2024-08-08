package server.wekick.crewRank.service;

import org.springframework.stereotype.Service;

@Service
public class CrewRankService {

    public String getCrewRank(String type){
        String response = type +  " 기준 크루 랭킹";
        return response;
    }
}
