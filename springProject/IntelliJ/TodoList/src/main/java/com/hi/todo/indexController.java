package com.hi.todo;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class indexController {
    @RequestMapping("/index")
    public void  getIndex(){
        log.info("/index");
        // view path : /WEB_INF/views/index.jsp
    }
}
