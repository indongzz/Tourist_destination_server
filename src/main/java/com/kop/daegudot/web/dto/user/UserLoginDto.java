package com.kop.daegudot.web.dto.user;

import lombok.Getter;

@Getter
public class UserLoginDto {
    private String email;
    private String password;

    public UserLoginDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
