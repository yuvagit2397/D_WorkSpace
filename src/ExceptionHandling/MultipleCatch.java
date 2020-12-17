package ExceptionHandling;

public class MultipleCatch {
	public static void main(String[] args) {

		try {

			System.out.println(110 / 0);

		} catch (ArithmeticException e) {

			System.out.println("ArithmeticException");
		} catch (Exception e) {

			System.out.println("Exception");

		} finally {
			System.out.println("finally");
		}

	}
}
