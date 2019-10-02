package command;

/**
 * Cake
 */
public class Cake implements ICake {
    private String mCakename;

    public Cake(String cakeName) {
        mCakename = cakeName;
    }

    public void createCake() {
        System.out.println("Create cake: " + mCakename);
    }
    public String getCakeName() {
        return mCakename;
    }
}