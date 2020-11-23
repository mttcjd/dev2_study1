package com.dev.study.entity;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Table(name="tb_project")
@Entity
public class ProjectEntity implements Serializable {

    private static final long serialVersionUID = 1L;

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


}
