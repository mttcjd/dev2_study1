package com.dev.study.domain.project;

import com.dev.study.domain.UserEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Table(name = "tb_project")
@Entity
public class ProjectEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String user_id;

    @Column(length = 200)
    private String pjt_title;

    @Column(length = 4000)
    private String pjt_desc;

    @Column(length = 50)
    private String pjt_status;

    @Column
    private int amount;

    @Column(length = 100)
    private String manager_id;

    @ManyToOne
    @JoinColumn(name="u_id")
    private UserEntity user;

    @Builder
    public ProjectEntity(String user_id, String pjt_title, String pjt_desc, String pjt_status, int amount, String manager_id, UserEntity user) {
        this.user_id = user_id;
        this.pjt_title = pjt_title;
        this.pjt_desc = pjt_desc;
        this.pjt_status = pjt_status;
        this.amount = amount;
        this.manager_id = manager_id;
        this.user = user;
    }

}
