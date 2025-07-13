package DSA_Practice;

import java.util.Scanner;

public class ArrayReverse {

    public static int[] reverse(int arr[]){
        int temp[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){

            temp[arr.length-i-1]=arr[i];

        }

        return temp;
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

        int rev[]=reverse(array);

        System.out.println("\n"+"Your reversed array will be :");

        for(int value:rev){
            System.out.print(value+" ");
        }

     }    

}
