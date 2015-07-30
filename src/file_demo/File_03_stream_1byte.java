package file_demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


// 입력과 출력 통로가 같을수는 없다
// 읽어와서 가지고 있다가 새로 저장 시키고 원본을 지우면 이동이 된다.

public class File_03_stream_1byte {
	public static void main(String[] args) throws IOException {
		// 목표 파일 객체 생성
		File dir = new File("D:\\java_401\\Day_19\\src\\file_demo");
		File file = new File(dir, "a.txt");

		// file을 대상으로 하여 입력 또는 출력을 진행
		// input저장소나 조립 필요없다
		FileInputStream fis = new FileInputStream(file); // 대상

		while (true) {
			int n = fis.read();
			if(n == -1){
				break;
			}
			//System.out.print(n +" "); // 아스키 코드 값으로 한 글자 읽어오기
			System.out.print((char)n +" "); // 한 글자 읽어오기
		}
		// -1 이 출력된다는 것은 없다는 것이다.
	}
}
/*
 * 분해를 해서 임시로 저장한다음 하나씩 보내야 한다
 * 이 보관소를 버퍼라고 한다.
 * 
 * 이미 분해시 순서를 정해놓았기 때문에 버퍼안에서는 무작위일 수 있다.
 * 
 */
