package inheritance;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Arr{
    static int count=0;
    static Scanner sc = new Scanner(System.in);
    static int num=sc.nextInt();
    static int[] arr = new int[num];
}
class Arr1 extends Arr{
    
    public void Input(){
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
    }
    public void output(){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=10){
                count+=1;
            }
        }
        System.out.println(count);
    }
}

public class Greater extends Arr1{
    public static void main(String args[]){
        Arr1 a=new Arr1();
        a.Input();
        a.output();
    }
}