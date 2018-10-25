package iterator_composite;

import java.util.Iterator;

/*
 * Lớp trừu tượng thể hiện cho các node
 */
public abstract class Corporate {
	public String getName() {
		return "";
	}

	public void add(Corporate corporate) {

	}

	public abstract Iterator interator();

	public void print() {

	}
}
