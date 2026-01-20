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
int A[]={11,322,33,4,5};                        // another way to declare data

Ex:- 
int A[]=new int []{11,22,33,44,55};

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


#Program02

int size;
scanner scanner=new scanner(System.in);
system.out.println("enter size");
size=scanner.nextInt();

int arr[] = new int[size];

for(int i=0;i<arr.length;i++){
    System.out.print("enter element");
    arr[i]=scanner.nextInt();
}

for(int i=0;i<arr.length;i++){
    system.out.println("arr  [ "+i+ "] --- "+arr[i]);
}


#Program03

class----->
for(int i=0;i<A.length;i++){
system.out.print(A[i] +" ");
}

main------>
int size;
scanner scanner= new scanner(system.in);

system.out.println("enter size");
size=scanner.nextInt();

int arr[] = new int [size];
    arr is a 1-d array which has size(5) element are of type int...

    for(int i=o;i<arr.length;i++){
        system.out.print(enter element);
        arr[i]=scanner.nextInt();
    }
        display(arr);



#Program04














todays work 
1) static memory allocation
        predefined data
2) dynamic memory allocation
        *at the time program execution memory get..according to data
        * dynamic memory allocation is better then static 
        CAUSE something related to the memory uses..













*/