package com.hi.deptspring.deptspring.domain;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class DeptDTO {

    private int deptno;
    private String dname;
    private String loc;
}
