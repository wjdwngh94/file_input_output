package file_demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_07_read_text {
	public static void main(String[] args) throws IOException {
		// 목표 파일 객체 생성
		File dir = new File("D:\\java_401\\Day_19\\src\\file_demo");
		File file = new File(dir, "c.txt");

		// file을 대상으로 하여 입력 또는 출력을 진행
		FileReader fr = new FileReader(file); //대상
		BufferedReader br = new BufferedReader(fr);
		
		//enter가 나오기 전까지 읽는다(한 문장 씩)
		
		while(true){
			String txt = br.readLine();
			if(txt == null) break;
			System.out.println(txt);
		} //문장종료의 eof 는 null이다
		
		/*String txt = br.readLine();
		System.out.println(txt);
		
		txt = br.readLine();
		System.out.println(txt);
		
		txt = br.readLine();
		System.out.println(txt);

		txt = br.readLine();
		System.out.println(txt); //문장종료의 eof 는 null이다
		*/
	}
}
