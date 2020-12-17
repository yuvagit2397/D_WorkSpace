package sriInheritance;

import yuvasrijava.Rivers;

public class SingleInheritanceEx extends Rivers {

	public static void hill() {
		System.out.println("\nHILLS\n");
		System.out.println("WESTERN GHATS");

		System.out.println("HIMALAYAS");

		System.out.println("ARAVALI RANGE");

	}

	public static void main(String[] args) {
		SingleInheritanceEx obj = new SingleInheritanceEx();
		hill();
		obj.riv();

	}

}
