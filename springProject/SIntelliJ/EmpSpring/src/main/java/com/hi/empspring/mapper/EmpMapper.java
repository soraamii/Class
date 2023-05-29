package com.hi.empspring.mapper;

import com.hi.empspring.domain.EmpDTO;
import com.hi.empspring.domain.EmpRegistRequest;
import com.hi.empspring.domain.RequestModifyRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {

    // 전체 사원 리스트 조회
    List<EmpDTO> selectAll();

    // 사원 추가
    int insertEmp(EmpRegistRequest request);

    // empno 컬럼으로 검색
    RequestModifyRequest selectByEmpno(int empno);

    // 사원 정보 변경
    // EmpDTO 전달 받는 updateEmp 메소드
    int updateEmp(RequestModifyRequest modifyRequest);

    // 사원 정보 삭제
    int deleteEmp(int empno);


}
