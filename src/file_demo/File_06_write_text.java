package file_demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//text 입출력은 String이다
//입력할때의 순서를 고려하지 않아도 되지만
//분해하여야 함으로 buffer가 필요하다
//String의 길이는 계속해서 변하는 가변 문자열 임으로
//이런것들을 처리하기 위한 새로운 통로를 사용하여야 한다.

public class File_06_write_text {
	public static void main(String[] args) throws IOException {
		// 목표 파일 객체 생성
		File dir = new File("D:\\java_401\\Day_19\\src\\file_demo");
		File file = new File(dir, "c.txt");

		// file을 대상으로 하여 입력 또는 출력을 진행
		
		FileWriter fw = new FileWriter(file); //문자열만 다르다
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		//pw에게 한 문자식전송을 요청 한다
		pw.println("드디어 수업이 끝나 갑니다.");
		pw.println("자바 참 쉽죠잉");
		//한문장 씩 분해시켜라
		
		//flush로 전송 시킨다
		pw.flush();
		
		fw.close();
		bw.close();
	}
}
