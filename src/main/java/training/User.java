package training;

public class User {

    public static int numberOfUsersCreated = 0;
    private String name;
    Boolean twoEars;
    public boolean hasHomeAddress;
    private String homeAddress;
    private int numberOfTimesHomeAddressChanged = 0;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name, boolean access) {
        if(access) {
            this.name = name;
        } else {
            System.out.println("YOU DON'T HAVE PERMISSION TO OVERRIDE!");
        }
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
        numberOfTimesHomeAddressChanged++;
    }

    public int getNumberOfTimesHomeAddressChanged() {
        return numberOfTimesHomeAddressChanged;
    }

}
