package com.dev.study.service;

import com.dev.study.entity.ProjectEntity;
import com.dev.study.entity.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProjectService {

    private ProjectRepository projectRepository;

    @Transactional(readOnly = true)
    public List<ProjectEntity> selectProject(){
        List<ProjectEntity> prjList = projectRepository.findAll();
        return projectRepository.findAll();
    }
}
