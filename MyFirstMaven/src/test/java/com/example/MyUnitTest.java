package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyUnitTest {
	@Test
	public void test1()
	{	
		Calculator cal = new Calculator();
		assertEquals(5,cal.findBig(5, 3));
	}
	@Test
	public void test3()
	{
		Calculator cal = new Calculator();
		assertEquals(10, cal.findSmall(5, 3));
	}

}
