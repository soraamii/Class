package com.hi.empspring.controller;

import com.hi.empspring.service.EmpReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
public class EmpReadController {

    @Autowired
    private EmpReadService readService;

    @RequestMapping("/read")
    public void read(@RequestParam("empno") int empno, Model model) {

        log.info("/emp/read");

        model.addAttribute("article", readService.getEmp(empno));

    }

}
