/*
Array : - 
------------->>>>>>----------------------
1) Array is an collection of similar data type.
2) Array index always start with 0.
3) Array is used to fast data search.
4) Array used contiguous memory.
5) Array index used to access each element.


Note :-
int A[]=new int [5]{11,22,33,44,55};            // comp gives error..
int A[]=new int []{11,22,33,44,55};             // comp run this code.

Ex:- 
int A[]=new int [5]{11,22,33,44,55};

access element  A[o];                            //A[index];
A.length used to get array length


int A[]=new int [5]{11,22,33,44,55};

for(int i=1;i<=A.length;i++){                   // access every element.....
    system.out.println(A[i]);
}

---------------->>>>>>>------------------>>>>>>>>>>-------------->>>>>>>>>>>---
---------------->>>>>>>------------------>>>>>>>>>>-------------->>>>>>>>>>>---


#Program01
// create an array to take input array size as well as array element...
    and print them.

import java.util.*;
int size;
system.out.println("enter size");
Scanner scanner = new Scanner(System.in);

int size = scanner.nextInt();
int arr[] = new int[size];

for(int i=0;i<arr.length,i++){
    System.out.print("enter element");
    arr[i] = scanner.nextInt();
}

for(int i=0;i<arr.length;i++){
    System.out.print(arr["+i+ "]----"+arr[i]);
}






















*/