package com.AutomationPractice;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class B {

	public static void main(String[] args) {
		String[] a= {"aa","bb","cc"};
		List<String> li=Arrays.asList(a);
		System.out.println(li);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.deepToString(a));
	}
	
	
}
 