package DSA_Practice;

import java.util.Scanner;

public class LargestElement {

    public static int largeElement(int arr[]){

        int largest=arr[0];

        for(int i=0;i<arr.length;i++){
            if (largest<arr[i]) {
                largest=arr[i];
            }
        }

        return largest;
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

        int res=largeElement(array);

        System.out.println("The largets number in the array is : "+res);

    }
    
}
