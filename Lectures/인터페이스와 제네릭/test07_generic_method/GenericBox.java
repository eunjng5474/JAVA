package test07_generic_method;

// 클래스를 제네릭으로 만들기 위해서는?
// 다양한 타입을 처리할 수 있도록 
// 타입 파라미터가 있어야 함 
public class GenericBox<T> {
	// T는 타입처럼 사용가능
	private T data;
	
	// 제네릭 메서드 
	// 타입 파라미터가 있는 메서드 
	public <K> void genericMethod(K k) {
		// 타입 파라미터를 메서드 내부에서 타입처럼 사용 가능 
		// 제네릭 메서드의 타입 파라미터는 메서드 내부로만 범위가 한정 
		// T : 클래스의 타입 파라미터 
		// K : 메서드만의 타입 파라미터
		System.out.println("T: "+data.getClass().getName());
		System.out.println("K: "+k.getClass().getName());
	}

	// Source - Generate Getters and Setters 
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
