package training;

public class User {

    public static int numberOfUsersCreated = 0;
    String name;
    Boolean twoEars;
    boolean hasHomeAddress;
    Integer myIntObject;
    int myIntPrimitive;

    public User(String name, boolean hasHomeAddress) {
        this.name = name;
        this.hasHomeAddress = hasHomeAddress;
        numberOfUsersCreated++;
    }

    public User(String name) {
        this.name = name;
        numberOfUsersCreated++;
    }

    public User(String name, boolean hasHomeAddress, Integer myIntObject, int myIntPrimitive) {
        this.name = name;
        this.hasHomeAddress = hasHomeAddress;
        this.myIntObject = myIntObject;
        this.myIntPrimitive = myIntPrimitive;
        numberOfUsersCreated++;
    }

    public boolean hasHomeAddress() {
        return hasHomeAddress;
    }

}
