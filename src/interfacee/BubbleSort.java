package interfacee;
import java.util.Scanner;
class Sort{
	static Scanner sc = new Scanner(System.in);
	static int num = sc.nextInt();
	static int[] arr = new int[num];
}
class Sorting extends Sort{
	public void Elements() {
	for(int i=0;i<num;i++) {
		arr[i]=sc.nextInt();
		}
	}
	public void Ele() {
		System.out.println("=======");
		System.out.println("Before sorting");
		for(int i=0;i<num;i++) {
			System.out.println(arr[i]);
		}
	}
	public void Bubble() {
		for(int i=0;i<arr.length;i++) {
			for (int j=1;j<(arr.length-i);j++) {
				if(arr[j-1]>arr[j]) {
					int temp;
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("=========");
		System.out.println("After sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			
	
		}
		System.out.println("Smallest Integer: "+arr[0]);
		if(arr[0]%2==0) {
			System.out.println("Smallest no is Even");
		}else {
			System.out.println("Smallest no is Odd");
		}
	}	
}
public class BubbleSort {
	public static void main(String[] args) {
		Sorting s = new Sorting();
		s.Elements();
		s.Ele();
		s.Bubble();
	}
}
