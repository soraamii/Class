package com.hi.deptspring.deptspring.mapper;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.domain.DeptRegistRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {

    // int 타입 사용 이유 :
    // 성공적으로 작업이 수행되었을 경우, 일반적으로 1을 반환하거나 성공 코드 반환
    // 작업을 수행할 대상이 없어 작업을 할 수 없는 경우, 일반적으로 0을 반환하거나 실패 코드 반환
    // 작업의 성공 또는 실패 여부를 나타내기 위해 int 값을 반환하는 것은 MyBatis의 일반적인 관행


    // 전체 부서 리스트
    List<DeptDTO> selectAll();

    // deptno 컬럼으로 검색 => DeptDTO
    DeptDTO selectbyDeptno(int deptno);

    // DeptRegistRequest를 받아서 insert 해 주는 insert
    int insertDept(DeptRegistRequest request);

    // DeptDTO 전달 받고 수정 처리 update 메소드
    int updateDept(DeptDTO deptDTO);

    int deleteDept(int deptno);

}
