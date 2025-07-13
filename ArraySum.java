package DSA_Practice;

import java.util.Scanner;

public class ArraySum {

    public static int Sum(int arr[]){

        int sum=0;
        for(int i=0;i<=arr.length-1;i++){

            sum +=arr[i];
        }


        return sum;
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

        int sum=Sum(array);

        System.out.println("\n"+"the Sum of array will be :"+sum);

    }    
    
}
