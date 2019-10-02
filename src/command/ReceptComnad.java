package command;

/**
 * ReceptComnad
 */
public class ReceptComnad implements IComannd {
    ICake iCake;

    ReceptComnad(ICake iCake) {
        this.iCake = iCake;
    }

    public void execute() {
        System.out.println("Recept cake: " + iCake.getCakeName());

    }

}