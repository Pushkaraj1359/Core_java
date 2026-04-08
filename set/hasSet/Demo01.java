

// Note : hasSet contain unique without maintaining insertion order



import java.util.HashSet;

class Demo01{
    public static void main(String[] args){
    HashSet<String> name=new HashSet<String>();

    name.add("Pushkaraj");
    name.add("Hanumant");
    name.add("Ajay");
    name.add("Vaibhav");
    name.add("balaji");
    name.add("Deepak");
    name.add("omkar");


    System.out.println("hasSet Elements :"+name);
    }
}


// OutPut : -

// hasSet Elements :[omkar, Hanumant, balaji, Pushkaraj, Vaibhav, Ajay, Deepak]
// if we see the output then you knows HasSet contains----> 1) unique element  2) insertion order not matter