package javaprograms;

public class PalindromeNumber {
	static int n;
	public static void main(String[] args)  {
		int a = 12343;

		n=a;
		int i, j = 0;
		while (n > 0) {
			i = n % 10;
			j = (j *10)+ i;
			n = n / 10;
		}
		if (a==j) {
			System.out.println("given no is palindrome");
			
		}
		else {
			System.out.println("not palindrome");
		}
	}

}