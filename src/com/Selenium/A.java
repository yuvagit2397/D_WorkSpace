package com.Selenium;

public class A extends B {

	int x=1;
	static void sum1() {
           int x=2;
           System.out.println(x);
          
	}
	public void sum2() {
        int x=2;
       System.out.println(super.x);
       
	}
	public void sum3() {
        int x=2;
       System.out.println(this.x);
       
	}
	
	public static void main(String[] args)
	{
           sum1();
           A ob=new A();
           ob.sum2();
           ob.sum3();
	}

	

}
