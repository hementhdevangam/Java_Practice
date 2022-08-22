import java.util.Scanner;
public class ArrayIo {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int[] arr;
		arr = new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
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
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
