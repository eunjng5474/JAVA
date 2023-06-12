package com.ssafy.aop;

public class OuchException extends Exception {
	public void handleException() {
		System.out.println("병원이나 가자!");
	}
}
