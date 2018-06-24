package com.example.demo1;

import java.util.Random;

public class MyRandom {
	
	private IRandom random;
	
	
	public MyRandom(IRandom random2) {
		this.random = random2;
	}


	public int generate() {
		return this.random.getNumber();
	}
}
