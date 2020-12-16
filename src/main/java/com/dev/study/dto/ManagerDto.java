package com.dev.study.dto;

import com.dev.study.domain.manager.ManagerEntity;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;

@Getter
public class ManagerDto {

    private Long id;
    private String user_id;
    private String manager_tel;
    private String manager_name;
    private String createdDate;
    private String modifiedDate;

    public ManagerDto(ManagerEntity manager) {
        this.id = manager.getId();
        this.user_id = manager.getUser_id();
        this.manager_tel = manager.getManager_tel();
        this.manager_name = manager.getManagerName();
        this.createdDate = manager.getCreatedDate().toString();
        this.modifiedDate = manager.getModifiedDate().toString();
    }
}
