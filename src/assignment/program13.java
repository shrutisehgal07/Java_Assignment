/*
 Given an integer array nums, find the subarray with the largest sum,
and return its sum.
 */

package assignment;

import java.util.Scanner;

public class Program13 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of an array");
		
		int n = sc.nextInt();
		
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();             // input values in the array
		}
		
		int max= arr[0];
		
		for(int i=0;i<n-1;i++) {
	
			int sum=0;
				
			for(int j=i+1;j<n;j++) {
			
			sum = sum+ arr[j];
			
			if(max<sum) {
				max=sum;
			}

			}
		}
		
		System.out.println(max);
		
}
}
