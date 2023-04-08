package Chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest3 {

	public static void main(String[] args) {
		
		// 원본 파일 : 파일 데이터를 읽어 와야 한다
		// 복사본  : 원본 파일의 데이터를 써야 한다
		
		try {
			InputStream in = new FileInputStream("D:\\test\\test1.txt");
			OutputStream out = new FileOutputStream("D:\\test\\test1copy.txt");
			
			int byteData = 0;
			
			while(true) {
				
				byteData = in.read(); // 받아 올 데이터가 없으면 -1
				if(byteData == -1) {
					break;
				}
				// 새로운 파일에 데이터를 쓴다
				out.write(byteData);
			}
			
			in.close();
			out.close();
			System.out.println("복사가 완료되었습니다.");
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
