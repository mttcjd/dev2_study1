package com.dev.study.service;

import com.dev.study.domain.project.ProjectEntity;
import com.dev.study.dto.ProjectDto;
import com.dev.study.domain.project.ProjectRepository;
import com.dev.study.dto.ProjectSaveDto;
import com.dev.study.dto.ProjectUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Transactional(readOnly = true) // 조회만
    public List<ProjectDto> selectProjectList(){
        return projectRepository.selectProjectList().stream()
                .map(ProjectDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public ProjectDto selectProject(Long id) {
        ProjectEntity project = projectRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        return new ProjectDto(project);
    }

    @Transactional
    public Long save(ProjectSaveDto dto) {
        return projectRepository.save(dto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, ProjectUpdateDto dto) {
        ProjectEntity project = projectRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        project.update(dto.getPjt_title(), dto.getPjt_desc(), dto.getPjt_status(), dto.getAmount(), dto.getManager_id());

        return id;
    }


}
