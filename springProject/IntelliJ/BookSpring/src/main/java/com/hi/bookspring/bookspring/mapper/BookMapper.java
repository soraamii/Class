package com.hi.bookspring.bookspring.mapper;

import com.hi.bookspring.bookspring.domain.BookDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {

    List<BookDTO> selectAll();
}
