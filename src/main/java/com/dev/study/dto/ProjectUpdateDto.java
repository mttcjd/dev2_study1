package com.dev.study.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProjectUpdateDto {

    private String pjt_title;
    private String pjt_desc;
    private String pjt_status;
    private int amount;
    private String manager_id;

    @Builder
    public ProjectUpdateDto(String pjt_title, String pjt_desc, String pjt_status, int amount, String manager_id){
        this.pjt_title = pjt_title;
        this.pjt_desc = pjt_desc;
        this.pjt_status = pjt_status;
        this.amount = amount;
        this.manager_id = manager_id;
    }
}
