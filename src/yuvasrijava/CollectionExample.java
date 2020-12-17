package yuvasrijava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionExample<E> {
	// Collection
	// List Set Map
	// List_ArrayList_LinkList_VectorList
	public  void sample() {
		// TODO Auto-generated method stub

		/*List li = new ArrayList(); // UpCasting
		li.add(1);
		li.add("paanai");
		li.add(12.22f);
		System.out.println(li);*/
		List<Integer> l = new ArrayList();
		//List<Integer> ln = new LinkedList<>();
		List<Integer> li1=new ArrayList<Integer>();
		
		li1.add(10);
		li1.add(20);
		li1.add(40);
		li1.add(30);
		li1.add(70);
		li1.add(70);
		li1.set(2,13);
		li1.add(2, 11);
		System.out.println(li1);
		int size=li1.size();
		System.out.println("size= "+size);
		l.addAll(li1);
		System.out.println(l);
		
		//for loop
		System.out.println("Using for");
		for(int i=0;i<li1.size();i++) {
			System.out.println(li1.get(i));
			/*int num=li1.get(i);
			if(num==10) {
				System.out.println(li1.get(i));
			}*/
			
		}
		//foreach
		System.out.println("Using forEach");
		for (int value : li1) {
			System.out.println(value);
		}
		System.out.println("Using iterator");
		Iterator itor=li1.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
		
		
		System.out.println("Using ListIterator using hasNext");
		ListIterator it=li1.listIterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		System.out.println("Using listIterator using hasPrevious");
		//ListIterator pre=li1.listIterator();
 		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
	}

	public static void main(String[] args) {
 CollectionExample ob=new CollectionExample();
		ob.sample();

	}
}
