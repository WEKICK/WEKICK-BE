package server.wekick.memerRank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import server.wekick.common.CommonResponse;
import server.wekick.common.exception.GeneralException;
import server.wekick.common.exception.GlobalErrorCode;
import server.wekick.memerRank.service.MemberRankService;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/member-rank")
public class MemberRankController {

    private void validatePageParam(Integer page){
        if (page == null || page < 0) {
            throw new GeneralException(GlobalErrorCode.BAD_PARAMS_ERROR);
        }
    }
    
    // 랭킹 타입 검증
    private void validateRankType(String type){
        List<String> validateType = Arrays.asList("score", "skills", "manner", "social");
        if (!validateType.contains(type)) {
            throw new GeneralException(GlobalErrorCode.GLOBAL_NOT_FOUND);
        }
    }

    @Autowired
    private MemberRankService memberRankService;

    @GetMapping("/{type}")
    public CommonResponse getMemberRank(@PathVariable("type") String type, @RequestParam(value = "page", required = false) Integer page) {
        validatePageParam(page);
        validateRankType(type);
        String response = memberRankService.getMemberRank(type);
        return CommonResponse.onSuccess(response);
    }
}
