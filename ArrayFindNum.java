package DSA_Practice;

import java.util.Scanner;

public class ArrayFindNum {

//    //Find Missing Number
//  Problem: Write a Java program to find the missing number in an array containing 
// numbers from 1 to N.
//Note- this will find only one missing number in the array where one number is missing between 1 to N
 public static int FindNum(int arr[]){
    int n=arr.length;    //suppose this will be the N

    int totalSum=n*(n+1)/2;     // this is the formula of sum of number till N

    int arraySum=0;                // initialize this as arraysum 
    for(int i=0;i<arr.length;i++){
        arraySum +=arr[i];
    }

    int diffnum=totalSum-arraySum;    // the difference between total sum and array sum 
                                    //will be the missing number
    if(diffnum<0){
        return diffnum*-1;
    }

    return diffnum;
 }
public static void main(String args[]){

     Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array you want to create :");

        int size=sc.nextInt();

        int array[]=new int[size];

        System.out.println("Enter the values of array one by one ");

        for(int i=0;i<=array.length-1;i++){
            array[i]=sc.nextInt();
        }

        int res=FindNum(array);

       System.out.println("The missing number will be .."+res);
    }    

}