package academy.learnprogramming.javacode;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        //list.add(new BigDecimal(10.5));
        list.get(0).toUpperCase();

        List list1 = new ArrayList<>();
        list.add("Goodbye");
    }

}
