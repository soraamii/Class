package com.hi.app.domain;

import lombok.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Report {

    private String snum;
    private String sname;
    private MultipartFile report;



}
