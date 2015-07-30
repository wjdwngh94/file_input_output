package file_demo;

import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
//多바이트

public class File_04_write_bytes {
	public static void main(String[] args) throws IOException {
		// 목표 파일 객체 생성
		File dir = new File("D:\\java_401\\Day_19\\src\\file_demo");
		File file = new File(dir, "b.txt");
		
		// file을 대상으로 하여 입력 또는 출력을 진행
		
		//1byte 단위의 데이터가 아니므로 버퍼와 분해도우미가 필요하다
		FileOutputStream fos = new FileOutputStream(file);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos); //통로
		DataOutputStream dos = new DataOutputStream(bos); //버퍼
		
		//무슨 자료형을 보낼 지 모르므로 알려준다.
		dos.writeInt(1000000000); // 알아서 int형대로 분해
		dos.writeChar('A'); // char 형태로 분해
		dos.writeDouble(3.141592); //double형태로 분해
		
		
		//전송
		dos.flush();
		
		//통로 폐기
		fos.close();
		bos.close();
		//dos.close();
		
	}
}
