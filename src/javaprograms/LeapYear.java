package javaprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();
		System.out.println("Enter the Year");
		for(int i=0;i<4;i++) {
		Scanner s = new Scanner(System.in);
		li.add(s.nextInt());
		}
		for (Integer year : li) {
			if ((year % 4 == 0 && year % 100!= 0)||year%400==0) {
				System.out.println("The given year " + year + " is a   leap year");
			}  else { 
				System.out.println("The given year " + year + " is not a leap year");

			}
		}
		
	}
	
}
