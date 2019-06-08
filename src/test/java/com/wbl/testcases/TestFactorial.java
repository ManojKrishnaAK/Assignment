package com.wbl.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestFactorial {
  
  
	  Factorial fa=null;
	  @Test
	  public void fact() {
		  fa=new Factorial();
		  int actual=fa.fac(5);
		  int expected=120;
		  Assert.assertEquals(expected, actual);
	  
  }
	  @Test
	  public void fact2() {
		  fa=new Factorial();
		  int input=fa.fac(4);
		  int output=24;
		  Assert.assertEquals(input, output);
	  }
	  @Test
	  public void fact3( ) {
		 fa=new Factorial();
		 int input=fa.fac(0);
		 int output=1;
		 Assert.assertEquals(input,output);
	  }
	  
}
