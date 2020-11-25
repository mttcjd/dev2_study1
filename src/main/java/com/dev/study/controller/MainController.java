package com.dev.study.controller;

import com.dev.study.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class MainController {

    //private final ProjectService projectService;

    @RequestMapping("/")
    public String main(Model model) {
        //model.addAttribute("list", projectService.selectProject());
        return "project_list";
    }

}
