package com.hi.empspring.controller;

import com.hi.empspring.service.EmpListService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class EmpListController {

    @Autowired
    private EmpListService listService;


    @GetMapping("/emp/list")
    public String getListPage(Model model) {

        log.info("GET /emp/list");

        model.addAttribute("list",listService.getList());

        return "list";
    }
}
