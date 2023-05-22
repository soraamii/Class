package com.hi.empspring.service;

import com.hi.empspring.domain.EmpRegistRequest;
import com.hi.empspring.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpRegistService {

    @Autowired
    private EmpMapper mapper;

    public int registEmp(EmpRegistRequest registRequest){

        return mapper.insertEmp(registRequest);
    }
}
