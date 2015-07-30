package file_demo;

import java.io.File;
//파일 입출력
//데이터 - Text(글자) , Binary(글자가 아닌 것듯 , 압축, 동영상, 사진, 실행파일 등...)
import java.io.IOException;

//이론상 cpu->hdd 까지의 통로가 있을 때 데이터의 크기에 따라 전송속도가 왜 다른가?
//Stream이라고 불리는 통로를 지나가기 위해서 크기가 큰(>1byte) 자료들은 CPU에서 분해하여 보낸다
//또한 hdd에서 불러올때도 저장되어졌던 조각들을 cpu에서 다시 조립한다.

//1byte입출력은 통로만 필요하다
//Text (최소 2byte), object, 다byte는 통로, 저장공간, 분해, 조립기가 필요하다

public class File_01_new {
	public static void main(String[] args) {
		//파일 = 경로 + 파일명
		//경로 : 파일의 위치
		
		String path = "D:\\java_401\\Day_19\\src\\file_demo";
		System.out.println(path);
		//파일명 : 파일의 이름
		
		String name = "test.txt";
		
		//파일의 객체 생성(파일 생성이 아님을 유의)
		File file = new File(path, name);
		
		try{
			boolean result = file.createNewFile();//파일 생성
			System.out.println(result);
			
			result = file.delete();
			System.out.println(result);
		}catch(IOException e){
			System.out.println("파일 작업 오류");
		}
		
	}
}
