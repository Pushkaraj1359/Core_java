package FunctionalPrograming.basic2;



interface ZeroParam{
    void sayHello();
}

interface oneParam{
    void printMessage(String s);
}


interface TwoParam{
    void addNumbers(int a , int b);
}





public class App {
    public static void main(String[] args) {

        // method 1 with zeroparameter
                        // note carefully    
                        // Anonymous and lambda expression both works same but lambda is more clean , clear and easy to read  

                        // Anonymous Inner class   
                        ZeroParam z1 = new ZeroParam() {
                            @Override
                            public  void sayHello(){
                                System.out.println("hello hello");
                            }
                        };

                        z1.sayHello();

                        // lambda expression ( ) -> { }

                        ZeroParam z2 = () -> System.out.println("hello hello hello");
                        z2.sayHello();


        // one parameter with lambda expression
                        oneParam param1 = (String s1) -> System.out.println("hello "+ s1);

                        param1.printMessage("Pushkaraj");
        

        // two parameter with lambda expression
                        TwoParam param2 = (int a, int b) -> System.out.println(a+b);
                        // even we can write (a,b)
                        // TwoParam param2 = (a,b) -> System.out.println(a+b);

                        param2.addNumbers(2,4);

        

    }
}
