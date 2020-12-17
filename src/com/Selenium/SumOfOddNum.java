package com.Selenium;

import java.util.Scanner;

public class SumOfOddNum {

	public static void main(String[] args) {
         int even=0,counteven=0,countodd=0,odd=0;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter First number");
		int a = ob.nextInt();
		System.out.println("Enter Second number");
		int b = ob.nextInt();
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				even++;
				counteven=counteven+i;
				
			}else if(i%2!=0)
			{
				System.out.println(i);
				odd++;
				countodd=countodd+i;
			}else
			{
				System.out.println("Invalid number");
			}
		}
		
		System.out.println(even);
		System.out.println(odd);
	}

}
