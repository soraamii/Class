package com.hi.empspring.controller;

import com.hi.empspring.domain.EmpRegistRequest;
import com.hi.empspring.service.EmpListService;
import com.hi.empspring.service.EmpRegistService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/emp/regist")
public class EmpRegistController {

    @Autowired
    private EmpRegistService registService;

    @GetMapping
    public String registForm(){
        log.info("GET emp/regist");
        return "registForm";
    }

    @PostMapping
    public String regist(EmpRegistRequest registRequest){

        log.info("Post /regist");
        log.info(registRequest);
        registService.registEmp(registRequest);

        return "redirect:list";
    }
}
