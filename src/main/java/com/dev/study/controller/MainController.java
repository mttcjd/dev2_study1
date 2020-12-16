package com.dev.study.controller;

import com.dev.study.dto.UserDto;
import com.dev.study.service.ManagerService;
import com.dev.study.service.ProjectService;
import com.dev.study.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final ProjectService projectService;
    private final ManagerService managerService;
    private final UserService userService;

    @GetMapping("/")
    public String main(Model model, @PageableDefault(size = 2, sort = "createdDate")Pageable pageRequest) {
        model.addAttribute("list", projectService.selectProjectList(pageRequest));
        return "project_list";
    }

    @GetMapping("/search")
    public String search(Model model, @PageableDefault(size = 2, sort = "createdDate")Pageable pageRequest, @RequestParam String keyword, @RequestParam String key) {
        model.addAttribute("list", projectService.selectProjectList(pageRequest, keyword));
        model.addAttribute("keyword", keyword);
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





    @GetMapping("/sign_in")
    public String signIn(Model model) {
        return "sign_in";
    }

    @GetMapping("/sign_up")
    public String signUp(Model model) {
        return "sign_up";
    }

    @PostMapping("/join")
    public String signUp(UserDto user){
        userService.joinUser(user);
        return "redirect:/sign_in";
    }

    @PostMapping("/fail")
    public String fail(Model model){
        model.addAttribute("msg","로그인 정보를 확인하세요");
        return "sign_in";
    }



}
