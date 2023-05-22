package com.hi.empspring.domain;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class EmpDTO {

    private int empno;
    private String ename;
    private String job;
    private int mgr;
    private String hiredate;
    private int sal;
    private int comm;
    private int deptno;

}
