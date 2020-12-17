package yuvasrijava;

public class BreakAndContinueExample {

	public static void breakExample() {
		for(int i=0;i<11;i++) {
			
			if(i==5) {
				
				break;
			}
			System.out.println(i);
		}

	}
	public static void continueExample() {
		for(int i=0;i<11;i++) {
			
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		breakExample();
		continueExample();
	}
}
