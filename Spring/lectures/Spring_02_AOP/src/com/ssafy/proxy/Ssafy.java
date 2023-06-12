package com.ssafy.proxy;

import java.util.Random;

public class Ssafy {
	// 필드는 필요 없고 
	
	// SSAFY인의 일상 
	public void coding() {
		System.out.println("컴퓨터를 부팅한다."); 			// 핵심관심사항 이전에 해야할 것 
		try {
			System.out.println("열심히 공부를 한다."); 	// 핵심관심사항 
			if(new Random().nextBoolean())
				throw new OuchException();
			System.out.println("Git에 Push 한다."); 		// 아무 이상없이 잘 마쳤을 때 
		}catch (OuchException e) {
			System.out.println("반차를 낸다."); 			// 문제가 발생했을 때  
		}finally {
			System.out.println("보람찬 하루를 마무리한다.");	// 모든게 끝이났을 때 
		}
	}

}
