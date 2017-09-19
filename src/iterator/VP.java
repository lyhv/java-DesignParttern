package iterator;

import java.util.Iterator;
/*
 * Cấu trúc một noode cha
 */
public class VP extends Corporate {
 private String name;
 private String division ; // Ten nhanh;
	@Override
	public Iterator interator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public VP(String name, String division ){
		this.name = name;
		this.division = division;
	}
	@Override
	public void print(){
		System.out.println("Name: "+ name+" Division: "+ division);
	}
	
}
