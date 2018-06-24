package com.example.demo1;

import org.springframework.stereotype.Service;

@Service
public class AddOperation {
	public double calculate(int x, int y) {
		return x + y;
//		return 0;
	}
}
