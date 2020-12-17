package sriArray;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.Selenium.S;

public class ArrayExamle {
	static Set<Integer> s = new HashSet<>();

	public static void arrayreation() {
		String[] s = new String[5];
		// syntax
		// dataType[] refName=new dataType[];

		// array index is starts with zero and ends with n-1(0-4)
		s[0] = "paanai";
		s[1] = "yokesh";
		s[2] = "jothi";
		s[3] = "chandran";
		s[4] = "senthil";

		String s1 = "senthil";
		System.out.println("size " + s.length);
		// System.out.println(s[1]);
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(s1)) {
				System.out.println(s[i]);
			}
			 System.out.println(s[i]);

		}

	}

	public static void iterationUsingForeachLoop() {
		String[] s1 = { "a", "b", "c" };

		for (String c : s1) {
			System.out.println(c);
			if (c.equals("b")) {
				System.out.println(c);
			}
		}

	}

	public static void toGetUserInput() {
		System.out.println("Enter the array SIZE");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] s1 = new int[size];
		//int name = s1.length;
		System.out.println("Enter the String");
		for (int j = 0; j < s1.length; j++) {
			Scanner scanner1 = new Scanner(System.in);
			s1[j] = scanner1.nextInt();
		}
		for (int i = 0; i < s1.length; i++) {

			s.add(s1[i]);

		}
		System.out.println(s);
}

	public static void test() {
       int[] a= {1,2,3,4,5,6,7,8,9};
       for(int i=0;i<a.length;i++) {
    	   int x=a[i];
    	  // System.out.println(x);
    	   if(x>5) {
    		   System.out.println(x); 
    	   }
       }
	}

	public static void main(String[] args) {
		 //arrayreation();
		toGetUserInput();
		// iterationUsingForeachLoop();
		//test();
	}

}
