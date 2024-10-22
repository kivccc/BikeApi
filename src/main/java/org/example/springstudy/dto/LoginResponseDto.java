package org.example.springstudy.dto;

import lombok.Data;
import lombok.Setter;

@Setter
public class LoginResponseDto {
    String refreshToken;
    String accessToken;
}
