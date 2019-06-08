package com.wbl.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPrime {
PrimeNumber pn =null;
@Test
public void testPrimeNum() {
	pn=new PrimeNumber();
	int input=pn.primeNum(29);
	String output="prime number";
	Assert.assertNotNull(input, output);
}
@Test
public void testPrimeNum2() {
	pn=new PrimeNumber();
	int input=pn.primeNum(6);
	String output="not a prime number";
	Assert.assertNotNull(input, output);
}
@Test
public void testPrimeNum3() {
	pn=new PrimeNumber();
	int input=pn.primeNum(5);
	String output="prime number";
	Assert.assertNotNull(input, output);
}
}
