package DSA_Practice;

import java.util.Scanner;

public class MoveZeroEnd {

    public static int[] MoveZero(int arr[]){

        int index=0;

        for(int i=0;i<arr.length;i++){   //This loop for filling first indexes
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;      // incresing index after each filling 
            }

        }
        while(index<arr.length){    // this loop is for filling last elements of array with zero
            arr[index]=0;
            index++;
        }

        return arr;

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

        int res[]=MoveZero(array);

       System.out.println("new array will be ..");

       for(int x:res){
        System.out.print(x+" ");
       }

    }
    
}
