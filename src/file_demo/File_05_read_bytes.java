package file_demo;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class File_05_read_bytes {
	public static void main(String[] args) throws IOException {
		// 목표 파일 객체 생성
		File dir = new File("D:\\java_401\\Day_19\\src\\file_demo");
		File file = new File(dir, "b.txt");

		// file을 대상으로 하여 입력 또는 출력을 진행

		FileInputStream fis = new FileInputStream(file); // 파일
		BufferedInputStream bis = new BufferedInputStream(fis); // 통로
		DataInputStream dis = new DataInputStream(bis); //버퍼
		
		//저장된 순서대로 불러오지 않으면 데이터 손실 발생
		int a=dis.readInt(); //결과를 저장해야 한다.
		char b = dis.readChar();
		double c = dis.readDouble();
		//File_04에서의 순서대로 해야 한다.
		//바뀔 경우 결과가 깨져서 나올 수 있다.
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		
	}
}
