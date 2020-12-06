package com.dev.study.dto;

import com.dev.study.domain.manager.ManagerEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ManagerSaveDto {

    private Long id;
    private String user_id;
    private String manager_tel;
    private String manager_name;


    @Builder
    public ManagerSaveDto(String user_id, String manager_tel, String manager_name) {
        this.user_id = user_id;
        this.manager_tel = manager_tel;
        this.manager_name = manager_name;
    }


    public ManagerEntity toEntity(){
        return ManagerEntity.builder()
                .user_id(user_id)
                .manager_tel(manager_tel)
                .manager_name(manager_name)
                .build();
    }
}
