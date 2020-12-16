package com.dev.study.domain.project;

import com.dev.study.domain.BaseTimeEntity;
import com.dev.study.domain.manager.ManagerEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Table(name = "tb_project")
@Entity
public class ProjectEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String user_id;

    @Column(length = 200, name = "pjt_title")
    private String pjtTitle;

    @Column(length = 4000)
    private String pjt_desc;

    @Column(length = 50)
    private String pjt_status;

    @Column
    private int amount;

    @Column(length = 100)
    private String manager_id;

    @ManyToOne
    @JoinColumn(name = "regBy", insertable = false, updatable = false)
    @JsonIgnore
    private ManagerEntity manager;


    @Builder
    public ProjectEntity(String user_id, String pjtTitle, String pjt_desc, String pjt_status, int amount, String manager_id, ManagerEntity manager) {
        this.user_id = user_id;
        this.pjtTitle = pjtTitle;
        this.pjt_desc = pjt_desc;
        this.pjt_status = pjt_status;
        this.amount = amount;
        this.manager_id = manager_id;
        this.manager = manager;
    }

    public void update(String pjtTitle, String pjt_desc, String pjt_status, int amount, String manager_id) {
        this.pjtTitle = pjtTitle;
        if(pjt_desc != null) this.pjt_desc = pjt_desc;
        this.pjt_status = pjt_status;
        this.amount = amount;
        this.manager_id = manager_id;
    }

}
