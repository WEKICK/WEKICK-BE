package server.wekick.search.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import server.wekick.common.CommonResponse;

@RestController
public class SearchController {

    @GetMapping("member-rank")
    public CommonResponse getMemberSearch(@RequestParam(value = "keyword", required = false) String keyword) {
        String response = keyword + " 개인 검색";
        return CommonResponse.onSuccess(response);
    }

    @GetMapping("crew-rank")
    public CommonResponse getCrewSearch(@RequestParam(value = "keyword", required = false) String keyword) {
        String response = keyword + " 크루 검색";
        return CommonResponse.onSuccess(response);
    }


}
