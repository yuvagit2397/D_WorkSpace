package homeWork;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEX {
	public static void linkList() {
			List<String> lin2=new LinkedList<String>();
			List<String> lin1=new LinkedList<String>();
			lin2.add("1");
			lin2.add("2");
			lin2.add("3");
			lin2.add("4");
			lin2.add("5");
			lin2.add("e,f");
			lin1.add("a");
			lin1.add("b");
			lin1.add("c");
			lin1.add("d");
			lin1.add("e,f");
			System.out.println(lin2);
			System.out.println(lin1);
			//size
			int s=lin1.size();
			System.out.println("list 1 size is "+s);
			
			int s1=lin2.size();
			System.out.println("list 2 size is "+s1);
			
			//get
			
			String g=lin1.get(2);
			String g1=lin2.get(4);
			System.out.println("list 1 get "+g);
			System.out.println("list 2 get "+g1);

			//addAll
			
			lin1.addAll(lin2);
			System.out.println("adding two lists "+lin1);
			
			//clear
			/*System.out.println("using clear ");
			lin1.clear();*/
			
			//remove all
			/*lin1.removeAll(lin2);
			System.out.println("using remove all "+lin1);*/
			
			//retain all
			lin2.retainAll(lin1);
			System.out.println("using Retain all "+lin2);
		
	}
	public static void main(String[] args) {
		linkList();
		
		
	}

}
