package interviewPrograms;

import java.util.Arrays;

public class ReverseString {
public static void main(String[] args) {
	String s="yuvasri";
	/*String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		char c=s.charAt(i);
		rev=rev+c;
	}
	System.out.println(rev);*/
	
	StringBuffer b=new StringBuffer(s);
	StringBuffer reverse = b.reverse();
	System.out.println(reverse);
	
	
	
	
}
}
