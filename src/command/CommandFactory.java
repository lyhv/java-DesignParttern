package command;

import java.util.ArrayList;

/**
 * CommandFactory
 * That class to store, order command
 */
public class CommandFactory {
private ArrayList<IComannd> iComannds = new ArrayList<IComannd>();
    public void putCommnd(IComannd iComannd){
        iComannds.add(iComannd);
    }

    public void excute() {
        for (IComannd comannd : iComannds) {
            comannd.execute();
        }
    }
}