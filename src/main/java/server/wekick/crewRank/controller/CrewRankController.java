package server.wekick.crewRank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import server.wekick.common.CommonResponse;
import server.wekick.common.exception.GeneralException;
import server.wekick.common.exception.GlobalErrorCode;
import server.wekick.crewRank.dto.CrewRankResponse;
import server.wekick.crewRank.service.CrewRankService;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("crew-rank")
public class CrewRankController {

    private void validatePageParam(Integer page){
        if (page == null || page < 0) {
            throw new GeneralException(GlobalErrorCode.BAD_PARAMS_ERROR);
        }
    }

    // 랭킹 타입 검증
    private void validateRankType(String type){
        List<String> validateType = Arrays.asList("skills", "win");
        if (!validateType.contains(type)) {
            throw new GeneralException(GlobalErrorCode.GLOBAL_NOT_FOUND);
        }
    }

    @Autowired
    private CrewRankService crewRankService;

    @GetMapping("/{type}")
    public CommonResponse getCrewRank(@PathVariable("type") String type, @RequestParam(value = "page", required = false) Integer page) {
        validatePageParam(page);
        validateRankType(type);
        CrewRankResponse response = crewRankService.getCrewRank(type);
        return CommonResponse.onSuccess(response);
    }
}
