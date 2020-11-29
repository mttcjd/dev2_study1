package com.dev.study.service;

import com.dev.study.dto.ProjectDto;
import com.dev.study.domain.project.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Transactional(readOnly = true)
    public List<ProjectDto> selectProject(){
        return projectRepository.selectProject().stream()
                .map(ProjectDto::new)
                .collect(Collectors.toList());
    }
}
