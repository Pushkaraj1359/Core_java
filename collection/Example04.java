
//import java.util.ArrayList;
import java.util.*;

class Example04{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(11);
        numbers.add(21);
        numbers.add(31);
        numbers.add(41);
        numbers.add(51);
        numbers.add(61);


        System.out.println(numbers.get(2));

        numbers.add(4,99);

        System.out.println(numbers);
        
        // substring = subList   
        List<Integer> list = numbers.subList(2,5);
        
        System.out.println(list);

        Iterator<Integer> itr = numbers.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("----------------");

        ListIterator<Integer> litr = numbers.listIterator();



    }
}