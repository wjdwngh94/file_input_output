package file_demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_02_stream_1byte {
	public static void main(String[] args) throws IOException {
		// 목표 파일 객체 생성
		File dir = new File("D:\\java_401\\Day_19\\src\\file_demo");
		File file = new File(dir, "a.txt");

		// file을 대상으로 하여 입력 또는 출력을 진행
		
		//1byte 입출력은 통로만 필요하다
		//FileOutputStream fos = new FileOutputStream(file); //대상을 적는 부분
		FileOutputStream fos = new FileOutputStream(file, true); //앞의 내용에 연속해서
		
		//만약 파일이 없다면??
		
		//fos에 1byte형태의 데이터를 통과시키면 출력된다.
		fos.write(65);
		fos.write('B');
		byte[] by = new byte[]{'H','e','l','l','o'};
		
		fos.write(by); // byte 연속 출력
		fos.write('\n');
		
	}
}
