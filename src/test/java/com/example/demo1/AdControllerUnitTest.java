package com.example.demo1;

import static org.junit.Assert.*;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.mockito.BDDMockito.given;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class AdControllerUnitTest {
	
	@Mock
	private AddOperation addOperation;
	private AddController controller;
	
	@Before
	public void initail() {
		initMocks(this);
		controller = new AddController();
		controller.setAddOperation(addOperation);
	}
	
	@Test
	public void test() {
		given(addOperation.calculate(2, 1)).willReturn(3.0);
		String actualResult = controller.add(2, 1);
		assertEquals("3.0", actualResult);
	}

}
