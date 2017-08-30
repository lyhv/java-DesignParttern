package test;

import java.util.HashSet;

public class Test {
	public enum CustomEnum {
		A, B, C
	}

	CustomEnum customEnum = CustomEnum.A;

	public void show() {
		switch (customEnum) {
		case A:
			break;
		case B:
			break;
		case C:
		}
	}

	public static void main(String[] args) {
		/*
		 * String s ="^[0-9]([1-9]*)(.25||.75||.0||.5)?$";
		 * System.out.println("00".matches(s));
		 */
		HashSet<Integer> hashset = new HashSet<Integer>();
		hashset.add(1);
		hashset.add(1);
		hashset.add(2);
		System.out.println(hashset.toString());
		Test test1 = new Test();
		Test test2 = new Test();
		System.out.println(test1.hashCode()+"  "+ test2.hashCode());
		
	}
}
