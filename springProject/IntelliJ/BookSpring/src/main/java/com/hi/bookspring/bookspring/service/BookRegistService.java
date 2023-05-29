package com.hi.bookspring.bookspring.service;

import com.hi.bookspring.bookspring.domain.BookRegistRequest;
import com.hi.bookspring.bookspring.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookRegistService {

    @Autowired
    private BookMapper mapper;

    public int registBook(BookRegistRequest registRequest){

        return mapper.insertBook(registRequest);
    }

}
