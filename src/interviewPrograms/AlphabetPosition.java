package interviewPrograms;

import java.util.Scanner;

public class AlphabetPosition {
public static void main(String[] args) {
	String s="abcdefghijklmnopqrstuvwxyz";
	
	System.out.println("enter the alphabet");
	Scanner sc=new Scanner(System.in);
    String toFind =sc.next();
    int position=0;
    for(int i=0;i<s.length();i++) {
    	 position=(s.indexOf(toFind))+1;
    	 System.out.println(position);
    }
			//System.out.println(position);
}
}
