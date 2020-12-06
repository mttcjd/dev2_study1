package com.dev.study.service;


import com.dev.study.domain.manager.ManagerRepository;
import com.dev.study.dto.ManagerDto;
import com.dev.study.dto.ManagerSaveDto;
import com.dev.study.dto.ProjectDto;
import com.dev.study.dto.ProjectSaveDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ManagerService {

    private final ManagerRepository managerRepository;


    @Transactional(readOnly = true) // 조회만
    public List<ManagerDto> selectManagerList(){
        return managerRepository.findAll().stream()
                .map(ManagerDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public Long save(ManagerSaveDto dto) {
        return managerRepository.save(dto.toEntity()).getId();
    }


}
