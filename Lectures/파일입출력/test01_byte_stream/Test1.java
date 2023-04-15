package test01_byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException {
		// byte stream 
		// => 이미지 
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		// 여기서는 예외 처리는 따로 하지 않음 
		// try ~ finally 왜 쓸까요? 
		try {
			in = new FileInputStream("newjeans.jpeg");
			out = new FileOutputStream("newjeans-copy.jpeg");
			
			int b;	// byte를 int형으로 저장해도 됨 (형변환) 
			
			while((b = in.read()) != -1) {
				out.write(b);
			}
			System.out.println("복사를 완료했습니다.");
			
		} finally {
			// 입출력 스트림을 닫아준다. 
			if(in != null)
				in.close();
			if(out != null)
				out.close();
			
			System.out.println("모든 리소스를 닫고 종료합니다. ");
		}
	}

}
