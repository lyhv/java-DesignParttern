package Iterator_composite;

import java.util.Iterator;

/**
 * 
 * @author asiantech Tao Một nhánh cho nhân viên
 */
public class Division extends Corporate {
	private Corporate[] mCorporate = new Corporate[100];
	private int number = 0;
	private String name;

	public Division(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void add(Corporate corporate) {
		mCorporate[number++] = corporate;
	}

	@Override
	public void print() {
		Iterator inIterator = interator();
		while (inIterator.hasNext()) {
			Corporate c = (Corporate) inIterator.next();
			c.print();
		}
	}

	@Override
	public Iterator interator() {
		// TODO Auto-generated method stub
		return new DivisionIterator(mCorporate);
	}

}
