package com.hi.bookspring.bookspring.controller;

import com.hi.bookspring.bookspring.domain.BookRegistRequest;
import com.hi.bookspring.bookspring.service.BookRegistService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/book/regist")
public class BookRegistController {

    @Autowired
    private BookRegistService registService;

    @GetMapping
    public String registForm(){

        log.info("GET /book/regist");

        return "book/registForm";

    }
    @PostMapping
    public String regist(BookRegistRequest registRequest){

        log.info("Post /book/regist");
        log.info(registRequest);
        registService.registBook(registRequest);



        return "redirect:/book/list";
    }
}
