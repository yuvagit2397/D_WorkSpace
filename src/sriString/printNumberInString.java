package sriString;

public class printNumberInString {
	public static void main(String[] args) {
		String s = "paanai123";

		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			if (charAt >= '0' && charAt <= '9');
			System.out.println(charAt);
		}
	}
}
