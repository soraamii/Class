package com.hi.bookspring.bookspring.controller;

import com.hi.bookspring.bookspring.service.BookListService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@Log4j2
public class BookListController {

    private final BookListService listService;

    public BookListController(BookListService listService){
        this.listService = listService;
    }


    public void getListPage(Model model){
        log.info("GET /book/list");

        model.addAttribute("list", listService.getList());

    }


}
