package com.hi.board.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BoardDTO {

    private int bno;
    private String title;
    private String content;
    private String writer;
    private int memidx;
    private String regdate;
    private String updatedate;
    private String file;
}
