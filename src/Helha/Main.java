package Helha;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {

        /*boolean in = false;
        System.out.println("in is " + in);
        in = truifier(in);
        System.out.println("in is " + in);

        int[] test={3,2,1,15,25,7,99,58};

        Arrays.sort(test);
        for (int i = 0; i < test.length  ; i++) {
            System.out.println(test[i]);

        }
        test(test);
        System.out.println(test[0]+" "+test[1]+" "+test[2]);

        myMethod();
*/      String name = "Guillaume";
        String book = "Building Java Programs ";
        System.out.println(book.indexOf(" "));
        System.out.println(book.substring(book.indexOf(" "), book.indexOf(" ",book.indexOf(" ")+1)));
        System.out.println(book.substring(book.indexOf(" "), book.length()).trim());
        System.out.println(name.concat(" "+ "Tricknot"+ " "+ "Java" ));

        String str1 = "Bonjour Walter";
        String str2 = "Bonjour Guillaume";
        String str3 = "Bonjour Benjamin";
        int var1 = str1.compareTo( str2 );
        System.out.println(var1);
        str1 = str1.replace("alter", "");
        String[] result = str1.split("W");
    }

    private static void test(int[] test) {
        test[1]=10;
        System.out.println(test[0]+" "+test[1]+" "+test[2]);
    }

    private static boolean truifier(boolean bool) {
        if (bool == false) {
            bool = true;
        }
        System.out.println("bool is " + bool);
        return bool;
    }

    static void myMethod(){
        System.out.println("I just got executed !");
    }
}


