package com.example.demo1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiviNumberTest {
	
//	@Test(expected=DivideOperationException.class)
//	public void shuld_throw_exeception_with_divided_by_zero() throws DivideOperationException {
//		DivideOperation operation = new DivideOperation();
//		operation.calculate(2, 0);
//	}
//	
//	@Test(expected=DivideOperationException.class)
//	public void _4_divide_2_should_b2_2()  throws DivideOperationException {
//		DivideOperation operation = new DivideOperation();
//		double actualResult = operation.calculate(4, 2);
//		assertEquals(2, actualResult, 0.000);
//		
//	}
	
	@Test
	public void shuld_throw_exeception_with_divided_by_zero() {
		DivideOperation operation = new DivideOperation();
		double actualResult = operation.calculate(2, 2);
		assertEquals(1, actualResult, 0.000);
	}
	
	@Test
	public void _4_divide_2_should_b2_2() {
		DivideOperation operation = new DivideOperation();
		double actualResult = operation.calculate(4, 2);
		assertEquals(2, actualResult, 0.000);
		
	}
	
//	@Test(expected=DivideOperationException.class)
//	public void shuld_throw_exeception_with_divided_by_zero_show() {
//		DivideOperation operation = new DivideOperation();
//		operation.calculate(2, 0);
//	}

}
