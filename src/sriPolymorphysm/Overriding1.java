package sriPolymorphysm;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;

public class Overriding1 extends MethodOverriding {
int a;
	public void rateOfInterest(int a) {
		System.out.println("5%");
		//return a;we need to change int instead of void because the returntype of 
		//'a'is int
	}

	public static void main(String[] args) {
		Overriding1 ob = new Overriding1();
		ob.loanAmount();
		ob.rateOfInterest(1);
	}
}
