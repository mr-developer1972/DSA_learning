package DSA_Practice;

import java.lang.reflect.Array;

public class ArrayADT {
    // have to build amethod of creating one array may be 
    // then create few operation method 
    private int array[];
    private int size;
    private int index;

    //Constructor
    public ArrayADT(int size){

        this.size=size;
        this.array=new int[this.size];
        this.index=0;

    }
    //Insert
    public void insert(int value){
        //will check if array is full
        if(index==size){
            System.out.println("Array is full");
            return;
        }
        array[index]=value;
        index++;

    }

    //Delete
    public void delete(int DeleteIndex){
        if(DeleteIndex<0||DeleteIndex>=index){
            System.out.println("Invalid index");
            return;
        }

        for(int i=DeleteIndex;i<index-1;i++){
            array[i]=array[i+1];
        }
        index--;    // trimming the index

    }

    //Search
    public int search(int num){
        if(num<0){
            System.out.println("Invalid num");
        }
        int result=-1;
        for(int i=0;i<=index-1;i++){
            if(array[i]==num)
            result=i;
            break;
        }
        
        return result;
    }

    //fetch 

    public int fetch(int indexValue){
        if(indexValue<0||indexValue>=index){
            System.out.println("Invalid index");
            return -1;
        }
        int result=array[indexValue];
        return result;
    }
    //travers
    public void Travers(){
        for(int i=0;i<this.index;i++){
            System.out.println(array[i]+"\t");
        }
        System.out.println();
    }

    //size
    public int getSize(){
        return this.index;
    }

}
