package server.wekick.crew.controller;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import server.wekick.common.CommonResponse;
import server.wekick.crew.service.CrewService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/crews")
public class CrewController {

    private final CrewService crewService;

    @PostMapping
    public CommonResponse createCrew() {
        return CommonResponse.onSuccess(null);
    }

    @PostMapping("/{crewId}/recruit")
    public CommonResponse recruitMember(
            @PathVariable Long crewId
    ) {
        return CommonResponse.onSuccess(null);
    }

    @PostMapping("/{crewId}/recruit/{recruitCode}/accept")
    public CommonResponse acceptRecruit(
            @PathVariable Long crewId,
            @PathVariable String recruitCode
    ) {
        return CommonResponse.onSuccess(null);
    }

    @GetMapping("/{crewId}")
    public CommonResponse getCrewDetails(
            @PathVariable Long crewId
    ) {
        return CommonResponse.onSuccess(null);
    }

    @PutMapping("/{crewId}")
    public CommonResponse updateCrewDetails(
            @PathVariable Long crewId
    ) {
        return CommonResponse.onSuccess(null);
    }

    @DeleteMapping("/{crewId}")
    public CommonResponse deleteCrew(
            @PathVariable Long crewId
    ) {
        return CommonResponse.onSuccess(null);
    }

    @DeleteMapping("/{crewId}/withdraw")
    public CommonResponse withdrawCrew(
            @PathVariable Long crewId
    ) {
        return CommonResponse.onSuccess(null);
    }
}
