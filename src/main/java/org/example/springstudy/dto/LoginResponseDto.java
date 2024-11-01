package org.example.springstudy.dto;

import lombok.Data;
import lombok.Setter;

@Data
public class LoginResponseDto {
    String refreshToken;
    String accessToken;
}
