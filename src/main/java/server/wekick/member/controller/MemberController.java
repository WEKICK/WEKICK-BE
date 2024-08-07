package server.wekick.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import server.wekick.common.CommonResponse;
import server.wekick.member.dto.MemberRequestDto;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    @GetMapping
    public CommonResponse checkNickname(@RequestParam String nickname) {
        return CommonResponse.onSuccess("Hello, world!");
    }
    @PostMapping
    public CommonResponse saveMemberInfo(@RequestBody MemberRequestDto.onboardingInfo onboardingInfo) {
        return CommonResponse.onSuccess("Hello, world!");
    }
    @DeleteMapping("/withdrawal")
    public CommonResponse membershipWithdrawal() {
        return CommonResponse.onSuccess("Hello, world!");
    }

    @GetMapping("/info")
    public CommonResponse getMemberInfo() {
        return CommonResponse.onSuccess("Hello, world!");
    }
    @PutMapping("/info")
    public CommonResponse updateMemberInfo(@RequestBody MemberRequestDto.onboardingInfo onboardingInfo) {
        return CommonResponse.onSuccess("Hello, world!");
    }
}