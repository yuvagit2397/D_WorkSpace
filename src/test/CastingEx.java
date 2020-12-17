package test;

public class CastingEx {
	public static void castingExample() {

		long  c=12123456;
		 String s = String.valueOf(c);
		System.out.println(s);
		int parseInt = Integer.parseInt(s);
		System.out.println(parseInt);
	}
	public static void main(String[] args) {
		castingExample();
	}
}
