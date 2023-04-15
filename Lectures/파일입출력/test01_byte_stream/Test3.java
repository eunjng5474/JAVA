package test01_byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) throws IOException {
		// byte stream 
		// => 이미지 
		
		// 여기서는 예외 처리는 따로 하지 않음 
		// try with resource
		// try 다음에 ()하고, ()안에 필요한 리소스를 정의 
		// 문장은 ;으로 구분해서 여러 개 올 수 있음. 
		// close를 따로 할 필요없이 알아서 close 해준다. 
		
		try (FileInputStream in = new FileInputStream("newjeans.jpeg");
			FileOutputStream out = new FileOutputStream("newjeans-copy3.jpeg")){
			
			// 버퍼를 사용하기
			byte[] buffer = new byte[10];
			int read;	// byte를 int형으로 저장해도 됨 (형변환) 
			
			while((read = in.read(buffer)) != -1) {
				// 매번 in.read(buffer)할 때마다 buffer에 바이트를 채워줌. 
				// read: 어디까지 읽으면 되는지 
				out.write(buffer, 0, read);
				System.out.println(Arrays.toString(buffer)+", "+read);
			}
			System.out.println("복사를 완료했습니다.");
			System.out.println("알아서 스트림을 닫아줍니다.");
		} 
	}

}
