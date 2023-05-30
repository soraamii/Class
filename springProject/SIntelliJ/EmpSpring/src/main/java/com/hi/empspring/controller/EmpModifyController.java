package com.hi.empspring.controller;

import com.hi.empspring.domain.EmpDTO;
import com.hi.empspring.domain.RequestModifyRequest;
import com.hi.empspring.service.EmpModifyService;
import com.hi.empspring.service.EmpReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@Log4j2
@RequestMapping("/emp/modify")
public class EmpModifyController {

    @Autowired
    private EmpReadService readService;

    @Autowired
    private EmpModifyService modifyService;

    @GetMapping
    public String getModifyForm(@RequestParam("no") int empno, Model model){

        log.info("GET /dept/modify");

        // EmpDTO -> EmpMapper.java => EmpDTO selectByEmpno(int empno);
        // -> EmpMapper.xml => select * from emp where empno = #{no) 쿼리 작성
        // -> EmpReadService => EmpDTO 타입의 getEmp 메소드 return mapper.updateEmp(dto)

        model.addAttribute("emp", readService.getEmp(empno));

        return "modifyForm";
    }

    @PostMapping
    public String modify(RequestModifyRequest modifyRequest, HttpServletRequest request){

        log.info(modifyRequest);

        modifyService.modifyEmp(modifyRequest, request);

        return "redirect:/emp/list";

    }

}
