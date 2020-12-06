package com.dev.study.dto;

import com.dev.study.domain.user.UserEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private Long id;
    private String user_id;
    private String user_pw;

    public UserEntity toEntity(){
        return UserEntity.builder()
                .user_id(user_id)
                .user_pw(user_pw)
                .build();
    }

    public UserDto(String user_id, String user_pw){
        this.user_id = user_id;
        this.user_pw = user_pw;
    }
}
