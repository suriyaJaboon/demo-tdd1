package com.example.demo1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void should_be_input_1_return_1() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.say(1);
		assertEquals("1", actualResult);
	}
	
	@Test
	public void should_be_input_2_return_2() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.say(2);
		assertEquals("2", actualResult);
	}
	
	@Test
	public void should_be_input_3_return_fizz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.say(3);
		assertEquals("Fizz", actualResult);
	}
	
	@Test
	public void should_be_input_4_return_4() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.say(4);
		assertEquals("4", actualResult);
	}
	
	@Test
	public void should_be_input_5_return_buzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.say(5);
		assertEquals("Buzz", actualResult);
	}
	
	@Test
	public void should_be_input_6_return_6() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.say(6);
		assertEquals("Fizz", actualResult);
	}
	
	@Test
	public void should_be_input_7_return_java() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.say(7);
		assertEquals("Java", actualResult);
	}

}
