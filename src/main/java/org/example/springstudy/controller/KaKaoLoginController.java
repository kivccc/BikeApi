package org.example.springstudy.controller;


import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.example.springstudy.dto.LoginResponseDto;
import org.example.springstudy.service.KakaoTokenService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KaKaoLoginController {

    private  final KakaoTokenService kakaoTokenService;

    @GetMapping("/login/oauth2/callback/kakao")
    public ResponseEntity<LoginResponseDto> kakaologin(HttpServletRequest request){
        String code=request.getParameter("code");
        LoginResponseDto loginResponseDto=kakaoTokenService.getKakaoToken(code);
        return ResponseEntity.ok(loginResponseDto);
    }
}
