/*
 * Find largest and small number in an array
 */

package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of an array");
		
		int n = sc.nextInt();
		
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();             // input values in the array
		}
		
		Arrays.sort(arr);                    // sorting the array in ascending order
		
		System.out.println(arr[n-1]);     //largest
		System.out.println(arr[0]);       // smallest
	}



}
