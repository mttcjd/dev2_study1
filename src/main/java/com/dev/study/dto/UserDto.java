package com.dev.study.dto;

import com.dev.study.domain.user.UserEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private Long id;
    private String user_id;
    private String user_pw;
    private String corp_nm;
    private String tel_no;

    public UserEntity toEntity(){
        return UserEntity.builder()
                .userId(user_id)
                .userPw(user_pw)
                .corp_nm(corp_nm)
                .tel_no(tel_no)
                .build();
    }

    @Builder
    public UserDto(Long id, String user_id, String user_pw){
        this.id = id;
        this.user_id = user_id;
        this.user_pw = user_pw;
    }
}
