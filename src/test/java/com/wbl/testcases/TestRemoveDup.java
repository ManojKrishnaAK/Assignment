package com.wbl.TestCases;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRemoveDup {
RemovewDuplicates rd=null;
@Test
public void removeDup() {
	rd=new RemovewDuplicates();
	int[] a={1,2,4,6,7,7,5,9};
	rd.findDuplicate(a);
	
		/*
		 * int actual[] =rd.findDuplicate(a); int[] expect = {7};
		 * Assert.assertEquals(actual, expect);
		 */
	
}
}
