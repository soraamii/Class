package com.hi.bookspring.bookspring.mapper;

import com.hi.bookspring.bookspring.domain.BookDTO;
import com.hi.bookspring.bookspring.domain.BookRegistRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {

    // 전체 도서 리스트
    List<BookDTO> selectAll();

    // BookRegistRequest를 받아서 insert 해주는 메소드
    int insertBook(BookRegistRequest request);


}
