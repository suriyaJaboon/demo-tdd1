package com.example.demo1;

import java.util.Random;
import static org.junit.Assert.*;

import org.junit.Test;

public class RandomTest {

//	@Test
//	public void shoude_be_random() {
//		Random random = new Random() {
//
//			@Override
//			protected int next(int bits) {
//				// TODO Auto-generated method stub
//				return 5;
//			}
//		};
//		
//		MyRandom myrandom = new MyRandom(random);
//		assertEquals(5, myrandom.generate());
//	}
	
	@Test
	public void should_be_random5() {
		Random5 random5 = new Random5();
		MyRandom myrandom = new MyRandom(random5);
		assertEquals(5, myrandom.generate());
	}
	
//	@Test
//	public void should_be_random6() {
//		Random6 spyRandom = new Random5();
//		MyRandom myrandom = new MyRandom(spyRandom);
//		assertEquals(5, myrandom.generate());
//	}

}

class Random5 implements IRandom {
	
	@Override
	public int getNumber() {
		return 5;
	}
}

class Random6 implements IRandom {
	public boolean called;
	@Override
	public int getNumber() {
		called = true;
		return 6;
	}
}