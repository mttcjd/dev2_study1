package com.dev.study.dto;

import com.dev.study.domain.project.ProjectEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProjectSaveDto {

    private String user_id;
    private String pjt_title;
    private String pjt_desc;
    private String pjt_status;
    private int amount;
    private String manager_id;

    @Builder
    public ProjectSaveDto(String user_id, String pjt_title, String pjt_desc, String pjt_status, int amount, String manager_id){
        this.user_id = user_id;
        this.pjt_title = pjt_title;
        this.pjt_desc = pjt_desc;
        this.pjt_status = pjt_status;
        this.amount = amount;
        this.manager_id = manager_id;
    }

    public ProjectEntity toEntity(){
        return ProjectEntity.builder()
                .user_id(user_id)
                .pjtTitle(pjt_title)
                .pjt_desc(pjt_desc)
                .pjt_status(pjt_status)
                .amount(amount)
                .manager_id(manager_id)
                .build();
    }
}
