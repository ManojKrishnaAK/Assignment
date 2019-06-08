package com.wbl.TestCases;

import java.util.*;

public class RemovewDuplicates {
	
		
		public int[] findDuplicate(int a[]) {
			
			List list = new ArrayList();
			
			for(int i=0;i<a.length-1;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						list.add(a[i]);
					}
				}	
				System.out.println(list);
				
			}
			return null;
		}
	}


