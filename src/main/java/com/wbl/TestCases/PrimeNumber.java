package com.wbl.TestCases;

public class PrimeNumber {
	    public int primeNum(int num) {
	        boolean bool = false;
	        for(int i = 2; i <= num/2; ++i)
	        {
	            // condition for nonprime number
	            if(num % i == 0)
	            {
	                bool = true;
	                break;
	            }
	        }

	        if (!bool)
	            System.out.println("prime number");
	        else
	            System.out.println("not a prime number");
			return num;
	    }
	    
	    
	}

