package com.wbl.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCompareArr {
	CompareArray ca = null;
@Test
public void testCompareArray() {
	ca = new CompareArray();
	int[] a= {2,32,3,2,3,3,4};
	int[] b= {2,32,3,2,3,3,4,5};
	boolean result=ca.compArray(a, b);
	Assert.assertFalse(result);
}
@Test
public void testCompareArray2() {
	ca = new CompareArray();
	int[] a= {2,32,3,2,3,3,4};
	int[] b= {2,32,3,2,3,3,4};
	boolean result=ca.compArray(a, b);
	Assert.assertTrue(result);
}
}
