package com.wbl.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestReverseNum {
	ReverseNum rn=null;
	@Test
	public void revNum() {
		rn=new ReverseNum();
		int input =rn.reverseNumber(2254);
		int output=4522;
		Assert.assertEquals(input, output);
	}
	@Test
	public void revNum2() {
		rn=new ReverseNum();
		int input =rn.reverseNumber(1234);
		int output=4321;
		Assert.assertEquals(input, output);
}
}
