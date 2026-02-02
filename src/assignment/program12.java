/*
Given an array of integers and an integer target, return indices of the
two numbers such that they add up to target.
 */

package assignment;

import java.util.Scanner;

public class program12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of an array");
		
		int n = sc.nextInt();
		
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i]= sc.nextInt();             // input values in the array
		}
		
		System.out.println("Enter the target value");
		int target = sc.nextInt();
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.print(i +" "+ j);
					break;
				}
			}
		}
	}
	

}
