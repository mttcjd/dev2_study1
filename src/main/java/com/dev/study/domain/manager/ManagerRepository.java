package com.dev.study.domain.manager;

import com.dev.study.domain.project.ProjectEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<ManagerEntity, Long> {

    Page<ManagerEntity> findByManagerNameContains(Pageable pageable, String keyword);
}
