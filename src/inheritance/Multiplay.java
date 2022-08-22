package inheritance;
import java.util.*;
import java.lang.*;
import java.io.*;
class Code{
    static Scanner sc = new Scanner(System.in);
    static int num = sc.nextInt();
    static int[] arr = new int[num];
}
class Code1 extends Code{
    public void Input(){
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            System.out.println(arr[i]*2);
        }
    }
}
public class Multiplay{
    public static void main(String args[]) throws java.lang.Exception{
        Code1 c = new Code1();
        c.Input();
    }
}