package com.dev.study.controller;


import com.dev.study.dto.ManagerDto;
import com.dev.study.dto.ManagerSaveDto;
import com.dev.study.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ManagerApiController {

    private final ManagerService managerService;

    @PostMapping("/manager/save")
    public Long save(@RequestBody ManagerSaveDto dto){
            return managerService.save(dto);
    }

    @PostMapping("/getManagerList")
    public List<ManagerDto> getManagerList(){
        return managerService.selectManagerList();
    }

}
