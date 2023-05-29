package com.hi.empspring.service;

import com.hi.empspring.domain.EmpRegistRequest;
import com.hi.empspring.mapper.EmpMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
@Log4j2
public class EmpRegistService {

    @Autowired
    private EmpMapper mapper;

    // HttpServletRequest -> HTTP 요청 정보를 담고 있는 HttpServletRequest 객체
    public int registEmp(EmpRegistRequest registRequest, HttpServletRequest request){

        // registRequest.getFile() -> 업로드된 파일을 나타내는 객체 반환
        // registRequest.getFile().getSize() -> 파일의 크기 확인
        if(registRequest.getFile() != null && registRequest.getFile().getSize() > 0) {
            // 웹 경로
            String uri = "/uploadfile";

            // 실제 파일이 저장될 경로
            String realPath = request.getSession().getServletContext().getRealPath(uri);

            // 새로운 파일 이름 생성 : 중복된 이미지 이름을 중복되지 않도록 처리
            // UUID : 범용 고유 식별자, 고유한 식별자가 필요한 시스템에서 사용
            //         ex) 여러 사용자가 파일을 업로하는 경우, 각 파일에 고유한 이름을 부여하기 위해 UUID 사용
            // UUID.randomUUID() 클래스 사용하여 UUID 생성
            // UUID.randomUUID().toString() -> 생성된 UUID를 문자열로 변환하여 사용 가능
            // -> 고유한 값을 파일 이름 등에 사용 가능
            String newFileName = UUID.randomUUID().toString()+registRequest.getFile().getOriginalFilename();

            File newFile = new File(realPath, newFileName);

            try {
                // 파일 저장
                registRequest.getFile().transferTo(newFile);
                // RequestRegBoard filename에 새로운 파일 이름 저장
                registRequest.setFilename(newFileName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }

        return mapper.insertEmp(registRequest);
    }
}
