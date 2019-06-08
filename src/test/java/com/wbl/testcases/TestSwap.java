package com.wbl.TestCases;


import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSwap {
	SwapNumber sn;
	
	@Test
	public void testSwapNum() {
		int a=10;
		int b=20;
		sn=new SwapNumber();
		int result[] = sn.swapNum(a,b);
		Assert.assertEquals(result[0],10);
		Assert.assertEquals(result[1], 20);
	}
	@Test
	public void testSwapNum2() {
		int a=20;
		int b=30;
		sn=new SwapNumber();
		int result[] = sn.swapNum(a,b);
		Assert.assertEquals(result[0],20);
		Assert.assertEquals(result[1], 30);
	}

}
