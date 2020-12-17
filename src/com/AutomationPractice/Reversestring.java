package com.AutomationPractice;

public class Reversestring {
	public static void reverseofword() {
		String s=" welcome";
		String reverse=" ";
		for(int i=s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println("reverse of word ="+ reverse);	
	}
	public static void main(String[] args) {
		reverseofword();
	}
}
