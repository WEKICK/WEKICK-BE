package server.wekick.memerRank.service;

import org.springframework.stereotype.Service;

@Service
public class MemberRankService {

    // 개인 랭킹 service
    public String getMemberRank(String type){
        String response = type +  " 기준 개인 랭킹";
        return response;
    }
}
