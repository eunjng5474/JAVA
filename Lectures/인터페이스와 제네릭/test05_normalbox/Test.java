package test05_normalbox;

public class Test {

	public static void main(String[] args) {
		NormalBox b = new NormalBox();
		
		b.setData("Hello World!");
		// instanceof를 써서 형변환하는 작업이 필요하다. 
		String s = (String) b.getData();

	}

}
