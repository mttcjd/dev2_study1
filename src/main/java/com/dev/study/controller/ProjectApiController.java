package com.dev.study.controller;


import com.dev.study.dto.ProjectSaveDto;
import com.dev.study.dto.ProjectUpdateDto;
import com.dev.study.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ProjectApiController {

    private final ProjectService projectService;

    @PostMapping("/project/save")
    public Long save(@RequestBody ProjectSaveDto dto){
        return projectService.save(dto);
    }

    @PutMapping("/project/update/{id}")
    public Long update(@PathVariable Long id, @RequestBody ProjectUpdateDto requestDto) {
        return projectService.update(id, requestDto);
    }


}
