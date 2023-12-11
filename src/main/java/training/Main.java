package training;

public class Main {

    // Interface
    // Abstract class
    // toString method
    // maven & gradle
    // junit & testng

    public static void main(String[] args) {
        int age = 35;
        Integer myAge = null; // NaN
        //double myDouble2 = myAge.doubleValue();
        String myStr = "asmdkasmf";
        char myChar = 'a';
        double myDouble = 19.99;
        boolean myBool = true;

        User myUser = new User("Lajos", true);
        User myUser1 = new User("Géza", true);
        User myUser2 = new User("Géza", true);
        User myUser3 = new User("Géza", true);
        User myUser4 = new User("Lajos", true);

        //myUser4.name = "Endre";
        myUser4.setName("Aladár", false);
        System.out.println(myUser4.getName());
        myUser4.setHomeAddress("Lakatos út 4.");
        myUser4.setHomeAddress("Bajcsy Zsilinszky utca út 5.");
        myUser4.setHomeAddress("Lakatos út 6.");
        System.out.println(myUser4.getNumberOfTimesHomeAddressChanged());
//        System.out.println(User.numberOfUsersCreated);

        MySingleton sing = MySingleton.getInstance();
        MySingleton sing2 = MySingleton.getInstance();
        MySingleton sing3 = MySingleton.getInstance();
        MySingleton sing4 = MySingleton.getInstance();
        MySingleton sing5 = MySingleton.getInstance();
        MySingleton sing6 = MySingleton.getInstance();

        PeldaClass pelda = new PeldaClass();


//        System.out.println(myUser.name);
//        System.out.println(myUser.twoEars);
//        System.out.println(myUser.hasEyes);

//        System.out.println(myUser.myIntObject);
//        System.out.println(myUser.myIntPrimitive);
//
//        System.out.println(myUser.hasHomeAddress());

    }

}
