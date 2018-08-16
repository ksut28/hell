package com.nisan.training.hell;

import static org.junit.Assert.*;

import org.junit.Test;

public class testjunit 
{

	@Test
	public void testAdd() 
	{
		calc c = new calc();
		assertEquals(10, c.add(5, 5));
		
	}
	@Test
	public void testsub() 
	{
		calc c = new calc();
		assertEquals(2, c.sub(7, 5));
		
	}	@Test
	public void testmul() 
	{
		calc c = new calc();
		assertEquals(35, c.mul(7, 5));
		
	}	@Test
	public void testdiv() 
	{
		calc c = new calc();
		assertEquals(1, c.div(7, 5));
		
	}
}
