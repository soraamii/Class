package com.hi.empspring.service;

import com.hi.empspring.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpDeleteService {

    @Autowired
    private EmpMapper mapper;

    public int deleteEmp(int empno){
        return mapper.deleteEmp(empno);
    }
}
