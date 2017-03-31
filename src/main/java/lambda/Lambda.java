package lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dwy on 2015/11/13.
 */
public class Lambda {
     /* Lambda Expressions, a new language feature, has been introduced in this release.
    They enable you to treat functionality as a method argument, or code as data.
     Lambda expressions let you express instances of single-method interfaces
     (referred to as functional interfaces) more compactly.
    Method references provide easy-to-read lambda expressions for methods that already have a name.*/

    private int count = 0;
    Runnable r1 = () -> {
        count = 1;
        System.out.println(this + "  " + count);
    };
    Runnable r2 = () ->  System.out.println(toString());

    public String toString() {  return "Hello, world"; }

    public static void main(String... args) {
        new Lambda().r1.run();
        new Lambda().r2.run();
    }


    private void test (){
      /*  int sum = 0;
        List<Integer> list = new ArrayList<>();
        Runnable r1 = () -> {
            sum = 1;
            count = 2;
            list.add(3);
        };*/
    }
}
