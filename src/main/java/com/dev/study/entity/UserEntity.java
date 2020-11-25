package com.dev.study.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Table(name="tb_user")
@Entity
public class UserEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String user_id;

    @Column(length = 100)
    private String user_pw;

    @Column(length = 100)
    private String corp_nm;

    @Column(length = 100)
    private String tel_no;

}
