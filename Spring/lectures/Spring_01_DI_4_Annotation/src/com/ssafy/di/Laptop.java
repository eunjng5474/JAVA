package com.ssafy.di;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
	
	public String getInfo() {
		return "랩톱";
	}

}
