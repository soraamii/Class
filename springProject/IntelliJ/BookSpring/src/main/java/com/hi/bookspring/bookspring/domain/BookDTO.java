package com.hi.bookspring.bookspring.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class BookDTO {

    private int bookid;
    private String bookname;
    private String publisher;
    private int price;
}
