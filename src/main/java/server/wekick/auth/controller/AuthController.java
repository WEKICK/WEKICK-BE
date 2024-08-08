package server.wekick.auth.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import server.wekick.auth.dto.AuthRequestDto;
import server.wekick.common.CommonResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {


    @GetMapping("/login/kakao/token")
    public CommonResponse loginWithKakao(@RequestParam String code) {
        return CommonResponse.onSuccess("Hello, world!");
    }
    @GetMapping("/logout/kakao/token")
    public CommonResponse logoutWithKakao(@RequestParam String code) {
        return CommonResponse.onSuccess("Hello, world!");
    }

    @PostMapping("/termsConsent")
    public CommonResponse saveTerms(@RequestBody AuthRequestDto.TermsConsentDto termsConsentDto) {
        return CommonResponse.onSuccess("Hello, world!");
    }

    @PostMapping("/email")
    public CommonResponse checkEmail(@PathVariable String email) {
        return CommonResponse.onSuccess("Hello, world!");
    }
}