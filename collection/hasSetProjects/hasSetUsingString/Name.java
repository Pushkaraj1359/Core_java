package collection.hasSetProjects.hasSetUsingString;

import java.util.HashSet;

class Data {
    String value;

    public Data(String value){
        this.value=value;
    }

    void displayValue(){
        System.out.println("Value:"+value);
    }

    public  String toString(){
        return value+" ";
    }

    @Override
    public int hashCode(){
        return value.length();
    }

    @Override
    public boolean equals(Object obj){
        Data data = (Data)obj;
        return  data.value.equals(this.value);
    }
}

public class Name{
    public static void main(String[] args){
        Data d1 = new Data("ram");
        Data d2 = new Data("raj");
        Data d3 = new Data("ram");

        HashSet<Data> hs = new HashSet<>();

        hs.add(d1);
        hs.add(d2);
        hs.add(d3);

        System.out.println(hs);
    }
}

