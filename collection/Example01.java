package collection;

import java.util.ArrayList;

public class Example01 {
    public static void main(String[] args) {
        

        ArrayList list = new ArrayList();

        list.add(11);
        list.add("11");
        list.add(11.11);
        list.add('1');
        list.add(null);

        System.out.println(list);

        System.out.println(list.get(0));

        


    }
}
