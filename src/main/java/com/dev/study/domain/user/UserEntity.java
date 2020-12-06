package com.dev.study.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
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


    @Builder
    public UserEntity(String user_id, String user_pw, String corp_nm, String tel_no) {
        this.user_id = user_id;
        this.user_pw = user_pw;
        this.corp_nm = corp_nm;
        this.tel_no = tel_no;
    }



}
