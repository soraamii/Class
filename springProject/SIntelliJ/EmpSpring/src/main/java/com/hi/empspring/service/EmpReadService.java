package com.hi.empspring.service;

import com.hi.empspring.domain.EmpDTO;
import com.hi.empspring.domain.RequestModifyRequest;
import com.hi.empspring.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpReadService {

    @Autowired
    private EmpMapper mapper;

    public RequestModifyRequest getEmp(int empno){

        return mapper.selectByEmpno(empno);
    }

}
