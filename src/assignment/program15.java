/*
 Given an array nums of n integers, return an array of all the unique
quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
 */

package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Program15 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int n= sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the target");
		int target= sc.nextInt();
		
		System.out.println("Enter the values of an array");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int sum=0;
		
		for(int i=0;i<n;i++) {
			if(i>0 && arr[i]==arr[i-1]) {
				continue;
			}
		
			for(int j=i+1;j<n;j++) {
				if(j>i+1 && arr[j]==arr[j-1]) {
					continue;
				}
		
				for(int k=j+1;k<n;k++) {
					if(k>j+1 && arr[k]==arr[k-1]) {
						continue;
					}
		
					for(int l=k+1;l<n;l++) {
						if(l>0 && arr[l]==arr[l-1]) {
							continue;
						}
			
			sum= arr[i]+ arr[j]+arr[k]+arr[l];
			
			if(sum==target) {
				System.out.println(arr[i]+" "+ arr[j]+ " "+ arr[k]+" "+arr[l]);
			}
					}
				}
			}
		}
}
}
