package com.hi.empspring.controller;

import com.hi.empspring.service.EmpDeleteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
public class EmpDeleteController {

    @Autowired
    private EmpDeleteService deleteService;

    @RequestMapping("/emp/delete")
    public String delete(@RequestParam("no") int empno){

        log.info(" /emp/delete");

        deleteService.deleteEmp(empno);
        log.info(empno + "번 부서 삭제");

        return "redirect:list";
    }

}
