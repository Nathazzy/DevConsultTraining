package training;

import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int myFirstInteger = Integer.MAX_VALUE;
        long myLong = 1231231123L;
        float myFloat = 12.2f;
        double myDouble = 12.23;
        // VEREM
        int[] myVerem = {44, 5234, 6346, 0, -12};
        ArrayList<String> myArr = new ArrayList<>();
        myArr.add("Array");
        myArr.add("Tuple");
        myArr.add("Verem");
        myArr.add("List");

        System.out.println(myFirstInteger + 1);
        Arrays.sort(myVerem);
        System.out.println(Arrays.toString(myVerem));
        System.out.println(myArr);

        for (int i = 0; i < myVerem.length; i++) {
            System.out.println(myVerem[i]);
        }

        System.out.println("--------------------------------------");

//        for (String str: myArr) {
//            System.out.println(str);
//        }

        myArr.forEach(System.out::println);

        myArr.forEach(str -> {
            int someInt = 12;
            System.out.println(str + " Lajos " + someInt);
        });

    }

}
