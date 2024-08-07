package server.wekick.match.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import server.wekick.common.CommonResponse;
import server.wekick.match.service.MatchService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/matches")
public class MatchController {

    private final MatchService matchService;

    @GetMapping("/dates")
    public CommonResponse getAvailableDates() {
        return CommonResponse.onSuccess(null);
    }

    @GetMapping
    public CommonResponse getMatches() {
        return CommonResponse.onSuccess(null);
    }

    @GetMapping("/{matchId}")
    public CommonResponse getMatchDetails(
            @PathVariable Long matchId
    ) {
        return CommonResponse.onSuccess(null);
    }

    @PostMapping("/{matchId}/apply")
    public CommonResponse applyMatch(
            @PathVariable Long matchId
    ) {
        return CommonResponse.onSuccess(null);
    }

    @PatchMapping("/{matchId}/cancel")
    public CommonResponse cancelMatchApply(
            @PathVariable Long matchId
    ) {
        return CommonResponse.onSuccess(null);
    }

    @PostMapping("/{matchId}/invitation")
    public CommonResponse invitePlayer(
            @PathVariable Long matchId
    ) {
        return CommonResponse.onSuccess(null);
    }
}
