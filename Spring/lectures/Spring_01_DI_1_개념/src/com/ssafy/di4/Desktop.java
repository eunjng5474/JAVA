package com.ssafy.di4;

public class Desktop implements Computer {
	// 필요한 필드 
	// CPU, 기타 부속품 등 
	
	// 정보를 반환하는 메서드 
	// 상속하는 순간 아래 정의 안 하면 못 씀 
	public String getInfo() {
		return "데스크톱"; 
	}

}
