package homeWork;

import java.util.Scanner;

import com.Selenium.Sample;

public class LeapYr
{
	public static void yearCheck()
	{
		System.out.println("Enter the year");
		for (int j = 0; j <= 10; j++) 
		{
			Scanner yr = new Scanner(System.in);
			int i = yr.nextInt();
			if (i%100==0&&i%400==0)
			{
				System.out.println("Leap year");
			}
				
			 else if (i%100!=0&&i%4==0) 
			
			 {
				System.out.println("Leap year");
				 
			 }
			 else 
			 {
				 System.out.println("Not a Leap year");
				
			}
				
		} 
						
	}

	public static void main(String[] args) {
		yearCheck();

	}
}
