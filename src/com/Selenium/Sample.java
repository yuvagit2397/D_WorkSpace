package com.Selenium;

public class Sample {

	public static void main(String[] args) {
     int result=0,i,j;
     for( i=1;i<=5;i++)
     {
    	 for(j=i;j<=5;j++)
    	 {
    		 if(i==j)
    		 result+=i;
    		 else
    			 break;
    			 
    		 
    	 }
     }System.out.println(result);
	}

}
