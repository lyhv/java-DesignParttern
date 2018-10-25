package iterator_composite;

import java.util.Iterator;
import java.util.function.Consumer;

public class VPIterator implements Iterator {
	private VP vp;
	public VPIterator(VP vp){
		this.vp = vp;
	}

	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object next() {
		// TODO Auto-generated method stub
		return vp;
	}

	public void remove() {
		// TODO Auto-generated method stub

	}

	public void forEachRemaining(Consumer action) {
		// TODO Auto-generated method stub
	}

}
