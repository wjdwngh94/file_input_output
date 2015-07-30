package file_demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

//통로 변경하여 키보드에서 입력받기
//system.in 표준 입력통로
public class File_08_KeyBoard {
	public static void main(String[] args) throws IOException {


		//네트워크나 콘솔에서 입력받는 경우는
		//InputStreamReader 사용한다
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("enter the message");
		
		String txt = br.readLine();
		System.out.println(txt);
	}
}
