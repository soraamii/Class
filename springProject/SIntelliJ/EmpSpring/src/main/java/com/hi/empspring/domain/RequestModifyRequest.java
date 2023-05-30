package com.hi.empspring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class RequestModifyRequest {

    private int empno;
    private String ename;
    private String job;
    private int mgr;
    private String hiredate;
    private int sal;
    private int comm;
    private int deptno;
    private String oldfile;
    private MultipartFile file;
    private String filename;



}
