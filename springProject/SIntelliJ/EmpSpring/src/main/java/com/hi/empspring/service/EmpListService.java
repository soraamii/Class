package com.hi.empspring.service;

import com.hi.empspring.domain.EmpDTO;
import com.hi.empspring.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpListService {

    @Autowired
    private EmpMapper mapper;

    public List<EmpDTO> getList(){
        return mapper.selectAll();
    }
}
