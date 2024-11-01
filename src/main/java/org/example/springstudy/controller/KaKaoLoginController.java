package org.example.springstudy.controller;


import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.example.springstudy.dto.LoginResponseDto;
import org.example.springstudy.service.KakaoTokenService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KaKaoLoginController {

    private  final KakaoTokenService kakaoTokenService;

    @GetMapping("/oauth2/callback/{code}")
    public ResponseEntity<?> kakaologin(@PathVariable String code){
        String accessToken = kakaoTokenService.getKakaoAccessToken(code);
        return ResponseEntity.ok().body(accessToken);
    }
}
