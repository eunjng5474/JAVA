package com.ssafy.proxy2;

public class Test {
	public static void main(String[] args) {
		Programmer p = new Programmer();
		Ssafy s = new Ssafy();
		
		PersonProxy px = new PersonProxy();
		px.setPerson(s);
		
		px.coding();
	}

}
