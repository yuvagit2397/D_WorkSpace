package javaprograms;

public class PalindromeString {
	public static void main(String[] args) {
     String s="malayala"; 
     String rev="";
     for (int i = s.length()-1; i >=0; i--) {
		char ch=s.charAt(i);
		rev=rev+ch;
	}
     System.out.println("reverse string "+rev);
     if (s.equals(rev)) {
    	 System.out.println("given string = "+s+" is palindrom");
		
	}else {
		System.out.println("not palindrome");
	}
		
		
	}

}
