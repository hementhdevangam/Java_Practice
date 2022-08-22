import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class One{
    static Scanner sc = new Scanner(System.in);
    static int num=sc.nextInt();
    static int[] arr = new int[num];
    
    public void Method(){
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
    }
    public void Calculate(){
        for(int i=0;i<num;i++){
            if (arr[i]>100 && arr[i]<=1000){
                arr[i]-=25;
            }else if(arr[i]>1000 && arr[i]<=5000){
                arr[i]-=100;
            }else if(arr[i]>5000){
                arr[i]-=500;
            }
        }
        for(int i=0;i<num;i++){
        System.out.println(arr[i]);
        }
    }
}
public class Sales{
    public static void main(String arge[]){
        One obj = new One();
        obj.Method();
        obj.Calculate();
    }
}