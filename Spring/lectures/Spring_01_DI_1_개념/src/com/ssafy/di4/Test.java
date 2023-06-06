package com.ssafy.di4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Programmer p = new Programmer();
		Computer computer = ComputerFactory.getComputer(sc.next());
		p.setComputer(computer);
		
		p.coding();
		
		
//		Programmer p2 = new Programmer();
//		Computer computer2 = ComputerFactory.getComputer(sc.next());
//		p2.setComputer(computer2);
//		
//		p2.coding();
		
		computer = ComputerFactory.getComputer(sc.next());
		p.setComputer(computer);
		
		p.coding();
	}
}
