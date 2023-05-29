package com.hi.empspring.service;

import com.hi.empspring.domain.EmpDTO;
import com.hi.empspring.domain.RequestModifyRequest;
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
public class EmpModifyService {

    @Autowired
    private EmpMapper mapper;

    public int modifyEmp(RequestModifyRequest modifyRequest, HttpServletRequest request){

        // 파일 저장 : 파일이 존재하면 저장
        if(modifyRequest.getFile() != null && modifyRequest.getFile().getSize() > 0) {

            // 웹 경로
            String uri = "/uploadfile";

            // 실제 경로
            String realPath = request.getSession().getServletContext().getRealPath(uri);

            // 새로운 파일 이름
            String newFilename = UUID.randomUUID().toString()+modifyRequest.getFile().getOriginalFilename();

            // 저장
            File newFile = new File(realPath, newFilename);
            try {
                modifyRequest.getFile().transferTo(newFile);

                // filename 속성에 새로운 파일 이름 저장
                modifyRequest.setFilename(newFilename);

            } catch (IOException e) {
              //  throw new RuntimeException(e);
                modifyRequest.setFilename(modifyRequest.getOldfile());
            }

        } else {
            // filename 속성에 이전 업로드된 파일 이름을 저장
            modifyRequest.setFilename(modifyRequest.getOldfile());
        }

        log.info(modifyRequest);


        return mapper.updateEmp(modifyRequest);
    }

}
