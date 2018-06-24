package com.example.demo1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AddControllerTest {
	
	@Autowired
	private TestRestTemplate rest;
	
	@Test
	public void _1_add_1_should_be_2() {
		String result = this.rest.getForObject("/add/1/1", String.class);
		assertEquals("2.0", result);
	}
	
	@Test
	public void should_be_return_hello() {
		String result = this.rest.getForObject("/hello", String.class);
		assertEquals("hello", result);
	}

}
