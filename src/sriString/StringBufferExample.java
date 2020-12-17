package sriString;

public class StringBufferExample {
	public static StringBuffer bufferExample() {
		
		StringBuffer buffer=new StringBuffer("s");
		long startTime = System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			buffer=buffer.append("p");
		}
		long endTime = System.currentTimeMillis();
		long exeTime=endTime-startTime;
		System.out.println("actual exe time "+exeTime+"ms");
		return buffer;
		
	}
	public static String stringMethodsExample() {
		String a="s";
		long startTime = System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			a=a+"p";
		}
		long endTime = System.currentTimeMillis();
		long exeTime=endTime-startTime;
		System.out.println("actual exe time "+exeTime+"ms");
		return a;
	}
	public static void main(String[] args) {

		/*
		 * String s = "asdf"; System.out.println("before con" + s.hashCode()); s = s +
		 * "asdf"; System.out.println("after con" + s.hashCode());
		 */

		StringBuffer sb = new StringBuffer("senthil");
		StringBuffer sb1 = new StringBuffer("1");
		// we cant compare
		boolean equals = sb.equals(sb1);
		System.out.println(equals);

		System.out.println(sb.hashCode());

		sb = sb.append("hello");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		// capacity
		int capacity = sb.capacity();
		System.out.println("capacity " + capacity);
		// delete
		StringBuffer sub = sb.delete(3, 5);
		System.out.println("After deletion " + sub);
		StringBuffer deleteCharAt = sb.deleteCharAt(4);
		System.out.println("delete particular ch " + deleteCharAt);
		
		//capacity
		sb.ensureCapacity(24);//formula (capacity*2+2)
		int capacity2 = sb.capacity();
		System.out.println(capacity2);
		//indexOf
		int indexOf = sb.indexOf("e");
		System.out.println(indexOf);
		
		int indexOf2 = sb.indexOf("e", 2);
		
		System.out.println(indexOf2);
		
		int lastIndexOf = sb.lastIndexOf("e");
		System.out.println(lastIndexOf);
		//length
		int length = sb.length();
		System.out.println("length "+length);
		//reverse
		StringBuffer reverse = sb.reverse();
		System.out.println("reverse "+reverse);
		
		
		String s="paanai";
		StringBuffer buffer=new StringBuffer(s);
		StringBuffer reverse2 = buffer.reverse();
		System.out.println(reverse2);
		
	stringMethodsExample();
		bufferExample();
		
		

	}
}
