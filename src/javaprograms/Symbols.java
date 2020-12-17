package javaprograms;

public class Symbols {
	public static void main(String[] args) {
		int i = 5;
		if (i >= 10 && i <= 20) {
			System.out.println("Example of &&");

		} else {
			System.out.println("the given value is less than 10");
		}
	}
}

//&& will not check the second condition if the first condition fails
//& checks the second condition even the first condition fails