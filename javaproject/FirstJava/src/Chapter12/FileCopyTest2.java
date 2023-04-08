package Chapter12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest2 {

	public static void main(String[] args) {
		
		// 원본 파일 : 파일 데이터를 읽어 와야 한다
		// 복사본  : 원본 파일의 데이터를 써야 한다
		
		try {
			InputStream in = new FileInputStream("D:\\test\\test.zip");
			
			// 필터스트림 사용 시에는 기본 스트림이 필요
			BufferedInputStream bin = new BufferedInputStream(in);
			
			OutputStream out = new FileOutputStream("D:\\test\\testcopy2.zip");
			
			//필터스트림 사용 시에는 기본 스트림이 필요
			BufferedOutputStream bout = new BufferedOutputStream(out);
			
			// 카피한 파일의 사이즈
			
			int copyByte = 0;
			
			// 배열에 담기는 데이터의 사이즈
			
			int byteDataSize = 0;
			
			// 데이터를 담아서 전송할 배열
			
			byte[] bufData = new byte[1024*2]; 
			// 2kb 사이즈의 배열 생성, 데이터를 배열에 저장해서 읽고 쓴다.
			
			
			int byteData = 0;
			
			while(true) {
				
				byteData = bin.read(); 
				
				// 전달한 배열에 byte 데이터를 담고, 몇 개 데이터를 전달하는지 개수를 반환
				// 더 이상 보낼 데이터가 없으면 -1 반환
				
				if(byteData == -1) {
					break;
				}
				
				// 파일에 데이터를 쓴다
				bout.write(byteData);
				
				
			}
			
			in.close();
			out.close();
			System.out.println("복사가 완료되었습니다." + copyByte + " byte");
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
