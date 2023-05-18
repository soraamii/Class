package com.hi.empspring.empspring.mapper;

import com.hi.empspring.empspring.domain.EmpDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {

    // 전체 사원 리스트
    List<EmpDTO> selectAll();

}
