package Chapter12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {

		try {
			OutputStream fout = new FileOutputStream("D:\\test\\test1.txt");

			String str = "HI~!!";

			byte[] arr = str.getBytes(); // String 클래스에서 문자열의 byte 배열을 반환

			fout.write(arr);
			fout.close();
			System.out.println("파일에 데이터 쓰기 성공");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
