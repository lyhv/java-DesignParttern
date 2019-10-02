package command;

/**
 * 
 * The command pattern is a behavioral design pattern in which an object is used
 * to encapsulate all information needed to perform an action or trigger an
 * event at a later time. 
 * 
 * This information includes the method name, the object
 * that owns the method and values for the method parameters.
 * 
 * Benifits
 * + Allow you to store list of code that is excuted at a later time or manay time
 * + Client says I want a specific Command to run when execute() is called on 1 of the ecapsulated (hidden) Objects
 * + An Object called the Invoker transfers this command to another OBJECT called a RECEVIER to excute the right code
 */
class Main {

    public static void main(String[] args) {
        ICake iCake = new Cake("Banh Quy");
        IComannd iCommndPrintCake = new CakeCommand(iCake);
        IComannd iComanndRecept = new ReceptComnad(iCake);
    
        CommandFactory commandFactory = new CommandFactory();
        commandFactory.putCommnd(iCommndPrintCake);
        commandFactory.putCommnd(iComanndRecept);
        commandFactory.excute();
    }
}