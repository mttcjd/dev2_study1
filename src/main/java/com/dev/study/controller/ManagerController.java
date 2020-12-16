package com.dev.study.controller;

import com.dev.study.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
public class ManagerController {

    private final ManagerService managerService;

    @GetMapping("/manager_list")
    public String managerList(Model model, @PageableDefault(size = 2, sort = "createdDate") Pageable pageRequest, @RequestParam(defaultValue = "") String keyword) {
        model.addAttribute("list", managerService.selectManagerList(pageRequest, keyword));
        model.addAttribute("keyword", keyword);
        return "manager_list";
    }

    @GetMapping("/manager_reg")
    public String managerReg(Model model) {
        return "manager_reg";
    }

}
