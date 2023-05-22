package com.hi.board.service.member;

import com.hi.board.domain.member.MemberRegistRequest;
import com.hi.board.mapper.MemberMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Service
@Log4j2
public class MemberRegistService {

    @Autowired
    private MemberMapper memberMapper;



    // MemberRegistRequest 객체, HttpServletRequest받고
    public int registMember(MemberRegistRequest registRequest, HttpServletRequest request){



        // 첨부파일이 있다면 파일을 받아서 저장

        if(registRequest.getUphoto() != null && registRequest.getUphoto().getSize() > 0) {

            // 저장 URI => 폴더
            String uri = "/uploadfile/member";

            // 실제경로
            String realPath = request.getSession().getServletContext().getRealPath(uri);

            // 새로운 파일의 이름을 생성해줘야 함 : uid_파일이름

            String newFileName = registRequest.getUid() + "_" + registRequest.getUphoto().getOriginalFilename();

            // 저장
            File newFile = new File(realPath, newFileName);

            try {
                registRequest.getUphoto().transferTo(newFile);
                // fileName에 새로운 파일 이름을 저장
                registRequest.setFileName(newFileName);

            } catch (IOException e) {
               // throw new RuntimeException(e);
                e.printStackTrace();
            }


        }

        log.info(">>> Service : registRequest" + registRequest);

        // mapper에 insert 요청
        return memberMapper.insertMember(registRequest);

    }

}
