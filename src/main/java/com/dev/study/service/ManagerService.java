package com.dev.study.service;


import com.dev.study.domain.manager.ManagerEntity;
import com.dev.study.domain.manager.ManagerRepository;
import com.dev.study.domain.project.ProjectEntity;
import com.dev.study.dto.ManagerDto;
import com.dev.study.dto.ManagerSaveDto;
import com.dev.study.dto.ProjectDto;
import com.dev.study.dto.ProjectSaveDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ManagerService {

    private final ManagerRepository managerRepository;


    @Transactional(readOnly = true) // 조회만
    public Page<ManagerDto> selectManagerList(Pageable pageRequest, String keyword){

        Page<ManagerEntity> managerList = managerRepository.findByManagerNameContains(pageRequest,keyword);

        Page<ManagerDto> pagingList = managerList.map(manager -> new ManagerDto(manager));

        return pagingList;

        /*return managerRepository.findAll().stream()
                .map(ManagerDto::new)
                .collect(Collectors.toList());*/
    }

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
