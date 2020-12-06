package com.dev.study.domain.manager;

import com.dev.study.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Table(name="tb_manager")
@Entity
public class ManagerEntity extends BaseTimeEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String user_id;

    @Column(length = 100)
    private String manager_tel;

    @Column(length = 100)
    private String manager_name;


    @Builder
    public ManagerEntity(String user_id, String manager_tel, String manager_name) {
        this.user_id = user_id;
        this.manager_tel = manager_tel;
        this.manager_name = manager_name;
    }

}
