package command;

/**
 * CakeCommand
 */
public class CakeCommand implements IComannd{
    private ICake iCake;
    public CakeCommand(ICake iCake) {
        this.iCake = iCake;
    }
    public void execute() {
        this.iCake.createCake();
    }
    
}