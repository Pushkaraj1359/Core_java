package array_declaration;

public class array01 {
    public static void main(String[] args){
        int arr[]={11,22,33,44,55,66,77};  // array init


        
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]+" ");     // print all element using for loop
        // }

        
        // for(int x : arr){
        //     System.out.println(x);             // using forEach print each element
        // }



        // Method ref
        // Only calls a single method directly
        // Arrays.stream(arr).forEach(System.out::println);           
        
        
        // Lambda expression
        // x = parameter, -> = arrow, 
        // System.out.println(x) = body
        // Can add more logic inside the lambda
        // Arrays.stream(arr).forEach(x-> System.out.println(x));    


        


    }
}
