package org.example.springstudy.service;

import org.example.springstudy.dto.LoginResponseDto;
import org.springframework.stereotype.Service;

@Service
public class KakaoTokenService {
    public LoginResponseDto getKakaoToken(String code){
        LoginResponseDto loginResponseDto=new LoginResponseDto();
        loginResponseDto.setAccessToken("123");
        loginResponseDto.setRefreshToken(code);
        return loginResponseDto;
    }
}
