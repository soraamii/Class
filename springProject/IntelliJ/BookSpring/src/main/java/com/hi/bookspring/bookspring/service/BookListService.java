package com.hi.bookspring.bookspring.service;

import com.hi.bookspring.bookspring.domain.BookDTO;
import com.hi.bookspring.bookspring.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookListService {

    @Autowired
    private BookMapper mapper;

    public List<BookDTO> getList(){
        return mapper.selectAll();
    }

}
