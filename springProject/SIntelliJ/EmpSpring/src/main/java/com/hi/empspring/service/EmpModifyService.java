package com.hi.empspring.service;

import com.hi.empspring.domain.EmpDTO;
import com.hi.empspring.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpModifyService {

    @Autowired
    private EmpMapper mapper;

    public int modifyEmp(EmpDTO dto){

        return mapper.updateEmp(dto);
    }

}
