package com.wbl.TestCases;


import org.testng.Assert;
import org.testng.annotations.Test;


public class TestFibonacci {
	Fibonacci fi=null;
@Test
public void testFib() {
	fi=new Fibonacci();
	int actual=fi.fib(5);
	int expect=8;
	Assert.assertEquals(actual, expect);	
}
@Test
public void testFib2() {
	fi=new Fibonacci();
	int input=fi.fib(10);
	int output=89;
	Assert.assertEquals(input, output);
	
}
}