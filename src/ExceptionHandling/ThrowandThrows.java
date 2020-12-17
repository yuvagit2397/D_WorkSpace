package ExceptionHandling;

import java.io.IOException;

public class ThrowandThrows {
	static String s="asd";
	public static void add() throws ArithmeticException, StringIndexOutOfBoundsException {
		System.out.println(10 / 2);
		char charAt = s.charAt(s.length());
		System.out.println(charAt);
	}

	public static void add1() {
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			throw new ArrayIndexOutOfBoundsException("sorry");
			}
		finally {
			System.out.println("finally");
		}
	}

	public static void main(String[] args) throws ArithmeticException, IOException {
		//add();
		add1();
	}
}
