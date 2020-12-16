package com.dev.study.domain.project;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
    @Query("SELECT p FROM ProjectEntity p ORDER BY p.id DESC")
    List<ProjectEntity> selectProjectList();

    Page<ProjectEntity> findAllBy(Pageable pageable);

    Page<ProjectEntity> findByPjtTitleContaining(Pageable pageable, String keyword);

}


