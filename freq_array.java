package assignments;

import java.util.Scanner;

public class freq_array {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<n;i++) {
			if(max<=arr[i]) {
				max=arr[i];
			}
		}
		int arr1[]=new int[max+1];
		for(int i=0;i<n;i++) {
			arr1[arr[i]]++;
		}
		for(int i=0;i<=max;i++) {
			if(arr1[i]!='\0') {
				System.out.println(i+" freq="+arr1[i]);
			}
		}
	}
}
