package mytest;

import java.util.Comparator;

public class LambdaTest {

    public static void main2(String... args) {
        Comparator<String> c =
                (lhs, rhs) ->
                {
                    System.out.println("I am comparing " +
                            lhs + " to " + rhs);
                    return lhs.compareTo(rhs);
                };
        int result = c.compare("Hello", "World");
        System.out.println("result : " + result);
    }

}
