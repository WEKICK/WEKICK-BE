package server.wekick.memerRank.service;

import org.springframework.stereotype.Service;
import server.wekick.memerRank.dto.MemberRankResponse;

@Service
public class MemberRankService {

    // 개인 랭킹 service
    public MemberRankResponse getMemberRank(String type){
        MemberRankResponse response = new MemberRankResponse();
        response.setType(type);
        return response;
    }
}
