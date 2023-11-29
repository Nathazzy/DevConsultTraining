package training;

public class MySingleton {

    private static MySingleton myOnlyInstanceEver;

    private MySingleton() {
        System.out.println("CONSTRUCTOR CALLED !!!!!!!!!!!!");
    }

    public static MySingleton getInstance() {
        if (myOnlyInstanceEver == null) {
            myOnlyInstanceEver = new MySingleton();
        }
        return myOnlyInstanceEver;
    }

}
