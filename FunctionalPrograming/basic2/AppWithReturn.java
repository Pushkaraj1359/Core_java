package FunctionalPrograming.basic2;



interface ZeroParam{
    String sayHello();
}

interface oneParam{
    String printMessage(String s);
}


interface TwoParam{
    int addNumbers(int a , int b);
}





public class AppWithReturn {
    public static void main(String[] args) {

        // method 1 with zeroparameter
                        // note carefully    
                        // Anonymous and lambda expression both works same but lambda is more clean , clear and easy to read  

                        // Anonymous Inner class   
                        ZeroParam z1 = new ZeroParam() {
                            @Override
                            public  String sayHello(){
                                return "hello hello";
                            }
                        };
                        System.out.println(z1.sayHello());

                        z1.sayHello();

                        // lambda expression ( ) -> { }

                        ZeroParam z2 = () -> "hello hello hello";
                        System.out.println(z2.sayHello());


        // one parameter with lambda expression
                        oneParam param1 = (String s1) -> "hello "+ s1;

                        System.out.println(param1.printMessage("Pushkaraj"));
        

        // two parameter with lambda expression
                        TwoParam param2 = (int a, int b) -> (a+b);
                        // even we can write (a,b)
                        // TwoParam param2 = (a,b) -> System.out.println(a+b);

                        System.out.println(param2.addNumbers(2,4));

        

    }
}
