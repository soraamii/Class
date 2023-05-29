package com.hi.bookspring.bookspring.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class BookRegistRequest {

    private String bookname;
    private String publisher;
    private int price;

}
