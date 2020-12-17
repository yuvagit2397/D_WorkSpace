package yuvasrijava;

public class ThisAndSuperExample extends Rivers {
	 short s=40;
	public void open() {
		short s = 20;
		System.out.println(s);
		System.out.println(this.s);
		//System.out.println(super.s);
		//int v=(this.s)+10;
		//System.out.println(v);
	}
     public static void add(int i) {
     System.out.println(i);
	}
	
public static void main(String[] args) {
	ThisAndSuperExample ob=new ThisAndSuperExample();
	ob.open();
	
}
}
