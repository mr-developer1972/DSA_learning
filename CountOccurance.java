package DSA_Practice;

import java.util.Scanner;

public class CountOccurance {

    public static int ocurrance(int arr[],int tar){
        int count=0;

        for(int i=0;i<=arr.length-1;i++){

            if(tar==arr[i]){
                count++;
            }
        }


        return count;
    }
    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array you want to create :");

        int size=sc.nextInt();

        int array[]=new int[size];

        System.out.println("Enter the values of array one by one ");

        for(int i=0;i<=array.length-1;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Your Array is :");
        for (int x:array){
            System.out.print(x+" ");
        }

        System.out.println("\n"+"Give An element you want to see the Occurance of :");

        int target =sc.nextInt();

        int res=ocurrance(array, target);

        System.out.println("This number "+target+" is occuraning for "+res+" Times");

    }    
    
}
