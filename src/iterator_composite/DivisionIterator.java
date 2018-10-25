package iterator_composite;

import java.util.Iterator;

public class DivisionIterator implements Iterator {
    private Corporate[] corporates;
    private int position = 0;


    public DivisionIterator(Corporate[] corporates) {
        this.corporates = corporates;
    }

    public boolean hasNext() {
        return position < corporates.length && corporates[position] != null;
    }

    public Object next() {
        // TODO Auto-generated method stub
        return corporates[position++];
    }

    public void remove() {
        // TODO Auto-generated method stub

    }

}
