package sriString;

public class StringMethodsExample {
	static String s = "Java Is a Programming Language";

	public static void stringMethods() {

		// length
		int size = s.length();
		System.out.println("length " + size);
		//charAt
		char charAt = s.charAt(4);
		System.out.println(charAt);
		// uppercase and lowercase
		String uc = s.toUpperCase();
		String lc = s.toLowerCase();
		System.out.println("uppercase= " + uc);
		System.out.println("lowercase= " + lc);
		// indexOf and LastIndexOf
		char c='z';
		int indexOf = s.indexOf(c);
		System.out.println("index of particular character"+c+"= " + indexOf);
		int lastIndexOf = s.lastIndexOf("m");
		System.out.println("lastindex of particular character 'm'= " 
		+ lastIndexOf);
		//replace
		String replace = s.replace(" ", "#");
		System.out.println("replacing space by # ="+replace);
        //trim
		String trim = s.trim();
		System.out.println(trim);
		int length = trim.length();
		System.out.println(length);
		//contains
		boolean contains = s.contains("m");
		System.out.println(contains);
		//equals
		boolean equals = s.equals("asdfg");
		System.out.println(equals);
		boolean equals1 = s.equals("java Is a Programming Language");
		System.out.println(equals1);
		//equalIgnoreCase
		boolean equalsIgnoreCase = s.equalsIgnoreCase("java Is a Programming Language");
	System.out.println(equalsIgnoreCase);
	//startsWith and endsWith
	boolean startsWith = s.startsWith("J");
	System.out.println(startsWith);
	boolean endsWith = s.endsWith("e");
	System.out.println(endsWith);
	String s1="yuvasri";
	String concat = s1.concat(" paanai");
	System.out.println(concat);
	
	}

	public static void main(String[] args) {
		stringMethods();
	}
}
