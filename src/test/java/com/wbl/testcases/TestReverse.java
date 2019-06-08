package com.wbl.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestReverse {
ReverseStr r=null;
@Test
public void test1() {
	r=new ReverseStr();
	String actual=r.reverse("hello");
	String except="olleh";
	Assert.assertEquals(actual,except);
}
@Test
public void test2() {
	r=new ReverseStr();
	String actual=r.reverse("welcome");
	String except="emoclew";
	Assert.assertEquals(actual, except);
			
}
}
