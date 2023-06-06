package com.ssafy.di4;

public class ComputerFactory {
	public static Computer getComputer(String type) {
		if(type.equals("D")) {
			return new Desktop();
		} else if (type.contentEquals("L")) {
			return new Laptop();
		}
		return null;
	}

}
