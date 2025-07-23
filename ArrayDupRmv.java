package DSA_Practice;

import java.util.Scanner;

public class ArrayDupRmv {
    
    public static int[] RemoveDuplicate(int arr[]){

        int temp[]=new int[arr.length]; //new array created 
       
        int ind=0;   //new array index counter

        for(int i=0;i<arr.length;i++){   //old array loop
            boolean isDuplicate=false;     // making all the indices not duplicate by default
        
            for(int j=0;j<=ind;j++){ //new array loop
                if(arr[i]==temp[j]){              //checking with the new aray element with old array elm
                    isDuplicate=true;       // if dupliacte making indices suplicate as true so it wont get added 
                    break;
                }         
            }

            if(!isDuplicate){         // if not present include into new array
                temp[ind]=arr[i];
                ind++;                 // Increasing the index 
            }
        }
        int res[]=new int[ind];     // new trimmed array with the length 
        for(int k=0;k<ind;k++){
            res[k]=temp[k];
        }


        return res;
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

       int res[]=RemoveDuplicate(array);

       System.out.println("new array will be ..");

       for(int x:res){
        System.out.print(x+" ");
       }
    }

}
