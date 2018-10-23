package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author asiantech
 * <p>
 * Lớp thiết lập
 */
public class Corporattion extends Corporate {
    private List<Corporate> corporates = new ArrayList<Corporate>();

    @Override
    public void add(Corporate corporate) {
        // TODO Auto-generated method stub
        corporates.add(corporate);
    }

    @Override
    public Iterator interator() {
        return null;
    }

    @Override
    public void print() {
        Iterator inIterator = corporates.iterator();
        while (inIterator.hasNext()) {
            Corporate c = (Corporate) inIterator.next();
            c.print();
        }
    }

}
