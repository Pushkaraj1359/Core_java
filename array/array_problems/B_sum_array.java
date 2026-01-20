package array_problems;

public class B_sum_array {
    public static void main(String[] args) {
        int arr[]={5, 8, 12, 6,3};

        // forward element printing 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // backward element printing 
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Sum of odd elements
        int sum1= 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                sum1=sum1+arr[i];
            }
        }
        System.out.println("the sum of odd elements = "+ sum1);

        // Sum of all elements
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum +arr[i];
        }
        System.out.println("sum of array = "+sum);

        float average;
        average = sum / arr.length;        // average calculation
        System.out.println("the array average is = "+average);

        // print element value is greater then average
        for(int i=0;i<arr.length;i++){
            if(arr[i]>average){
                System.out.println(arr[i]);
            }
        }


        int sum2 = 0;
        int count = 0 ;
        for(int x : arr){
            sum2 = sum2 + x;
            count++;
        }
        System.out.println("the sum of elements by using forEach loop = "+ sum2);

        int ave = sum2/count;
        System.out.println("the average  = "+ave);

        



        // shift first element to last 
        // 11 22 33 44 55
        // 22 33 44 55 11

    



        // last to first
        // int a[]={1 ,2 ,3, 4 ,5};

        // int temp = a[a.length-1];

        // for(int i=a.length-1;i>0;i--){
        //     a[i]=a[i-1];

            
        // }
        // a[0]=temp;

        // for(int i=0;i<a.length;i++){
            
        //     System.out.println(a[i]);

        // }



        /*int a[]={10 ,20 ,30, 40 ,50};
        //int temp = a[a.length-1];
        for(int i=a.length-1;i>1;i--){      
        }
        int temp1=a[0];
        a[0]=a[a.length-1];
        a[a.length-1]=temp1;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }*/
        
        
        int arrrr[]={10 ,20 ,30, 40 ,50};
        //int temp = a[a.length-1];
        for(int i=arrrr.length-1;i>1;i--){      
        }
        arrrr[0]=arrrr[0] + arrrr[arrrr.length-1];
        arrrr[arrrr.length-1] = arrrr[0] - arrrr[arrrr.length-1];
        arrrr[0] = arrrr[0] - arrrr[arrrr.length-1];

        for(int i = 0; i<arrrr.length; i++){
            System.out.println(arrrr[i]);
        } 


        

        // x= x+y;
        // y=x-y;
        // x=x-y;























        // important 
        // swap without third variable
    }
}
