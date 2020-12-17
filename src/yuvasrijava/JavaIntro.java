package yuvasrijava;

public class JavaIntro extends JavaBasics{

	int x;
	
	public void add() {
		int a=20;
		System.out.println(a);
		System.out.println(x);
		Looping(2, 20);
		System.out.println("add");
	}

	public void sub() {
		Looping(0,10);
		System.out.println("sub");
	}

	public void mul() {
		Looping(10, 25);
		System.out.println("mul");
	}

	public static void div() {
		System.out.println("div");
	}

	public static void main(String[] args) {
		//classname refname=new classname();
		JavaIntro calDiv =new JavaIntro();
		calDiv.add();
		div();
		calDiv.sub();
	calDiv.mul();
	}

}
