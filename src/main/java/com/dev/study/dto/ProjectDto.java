package com.dev.study.dto;

import com.dev.study.domain.project.ProjectEntity;
import lombok.Getter;


@Getter
public class ProjectDto {
    private Long id;
    private String user_id;
    private String pjt_title;
    private String pjt_desc;
    private String pjt_status;
    private int amount;
    private String manager_id;
    private String createdDate;
    private String modifiedDate;

    public ProjectDto(ProjectEntity entity){
        this.id = entity.getId();
        this.user_id = entity.getUser_id();
        this.pjt_title = entity.getPjt_title();
        this.pjt_desc = entity.getPjt_desc();
        this.pjt_status = entity.getPjt_status();
        this.amount = entity.getAmount();
        this.manager_id = entity.getManager_id();
        this.createdDate = entity.getCreatedDate().toString();
        this.modifiedDate = entity.getModifiedDate().toString();
    }


}
