package com.qa.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTwo {
	
   @Test
	
	public void sum() {
		System.out.println("sum method");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}
	

	@Test
	
	public void sub() {
		System.out.println("sub method");
		int a=10;
		int b=20;
		Assert.assertEquals(-10, a-b);
	}
	
	

	@Test
	
	public void mul() {
		System.out.println("mul method");
		int a=10;
		int b=20;
		Assert.assertEquals(200, a*b);
	}
	
	
    @Test
	
	public void div() {
		System.out.println("div method");
		int a=10;
		int b=20;
		Assert.assertEquals(2, b/a);
	}
	
	
}
