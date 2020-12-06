package com.dev.study.controller;

import com.dev.study.dto.ManagerDto;
import com.dev.study.service.ManagerService;
import com.dev.study.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final ProjectService projectService;
    private final ManagerService managerService;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("list", projectService.selectProjectList());
        return "project_list";
    }

    @GetMapping("/project/{id}")
    public String selectProject(@PathVariable Long id, Model model) {
        model.addAttribute("project", projectService.selectProject(id));
        model.addAttribute("managerList", managerService.selectManagerList());
        return "project_edit";
    }

    @GetMapping("/project_reg")
    public String projectReg(Model model) {

        model.addAttribute("managerList", managerService.selectManagerList());
        return "project_reg";
    }

    @GetMapping("/manager_list")
    public String managerList(Model model) {
        model.addAttribute("list", managerService.selectManagerList());
        return "manager_list";
    }

    @GetMapping("/manager_reg")
    public String managerReg(Model model) {
        return "manager_reg";
    }

    @GetMapping("/sign_in")
    public String signIn(Model model) {
        return "sign_in";
    }



}
