package sriAbstraction;

public class AbstractExample1 extends AbstractExample {

	@Override
	public void sbi() {
		System.out.println("State Bank of India");
		
	}

	public void iob() {
		System.out.println("Indian Overseas Bank");
	}
public static void main(String[] args) {
	AbstractExample1 ob=new AbstractExample1();
	ob.sbi();
	indian();
	
}
}
