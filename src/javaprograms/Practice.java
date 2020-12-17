package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Practice {
	public static void armstrongNumber() {
		
		for(int num=1;num<=1000;num++) {
			int i,j=0;
			int a=num;
		while(a>0) {
			 i=a%10;
			 j=j+(i*i*i);
			 a=a/10;
		}
		if(num==j) {
			System.out.println(num);
		}else {
			continue;
		}
		
		}
		
	}
	public static void ascendingArray() {
		 Integer a[]= {6,56,21,32,2,2,37,2,1};
		 for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			}
		}
		 }
		
		for (int k = 0; k< a.length; k++) {
			//System.out.println(a[k]);
		}
		
		 Set<Integer> s=new TreeSet<>();
		 List<Integer> li=new ArrayList<Integer>();
		 for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
			li.add(a[i]);
		}
		
		Collections.sort(li);
		
		System.out.println(li);
		Collections.reverse(li);
		System.out.println(li);
		 Collections.sort(Arrays.asList(a));
		 for (int i = 0; i < a.length; i++) {
			 
			System.out.println(a[i]);
		
		}
		
		
	}
	public static void arrayPrintingWays() {
		 Integer a[]= {6,56,21,32,2,2,37,2,1};
		 for (int i = 0; i < a.length; i++) {
			System.out.println("using for "+a[i]);
		}
	}
	
	public static void missingNumber() {
      int[] arr= {1,2,3,4,6,7,8,9};
      int size1=0;
      int size2=0;
      for (int i = 0; i < arr.length; i++) {
		size1=size1+arr[i];
	}
      for (int j = 1; j <10 ; j++) {
    	  size2=size2+j;
		}
      int miss=size2-size1;
      System.out.println("missing num is "+miss);
	}
	public static void removeDup() {
      List<Integer> li=new ArrayList<Integer>();
		int a[]= {2,4,6,8,9,1,3,5,7,9};
		for (int i = 0; i < a.length; i++) {
			if(li.contains(a[i])) {
		   System.out.println(a[i]);
		}else {
			if(li.size()==0) {
			li.add(a[i]);
			}
			for (int k = 0; k < li.size(); k++) {
				Integer c = li.get(k);
				if(a[i]>c) {
					li.add(a[i]);				
					}else {
						
					}
			}
		}
		}
		
		System.out.println(li);
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		removeDup();
	}
}
