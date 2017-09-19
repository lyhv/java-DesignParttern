package iterator;

import java.util.Iterator;
import java.util.function.Consumer;

public class DivisionIterator implements Iterator {
	private Corporate[] corporates;
	private int locaiton = 0;
	

	public DivisionIterator(Corporate[] corporates) {
		this.corporates = corporates;
	}

	public boolean hasNext() {
	return locaiton <corporates.length && corporates[locaiton] !=null;
	}

	public Object next() {
		// TODO Auto-generated method stub
		return corporates[locaiton++];
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
