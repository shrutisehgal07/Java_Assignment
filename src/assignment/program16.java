/*
 Given an array of intervals where intervals[i] = [starti, endi], merge all
overlapping intervals, and return an array of the non-overlapping
intervals that cover all the intervals in the input.
 */

package assignment;

//import java.util.Scanner;

public class program16 {
	public static void main(String[] args) {
		
		int [][] arr= {{1,3},{2,6},{8,10},{15,18}};
		
		int n=arr.length;
		//int m= arr[0].length;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i][0]>arr[j][0]) {
					
					int temp1[]= arr[i];
					arr[i]=arr[j];
					arr[j]=temp1;
					
				}
			}
		}
		
		int start= arr[0][0];
		int end= arr[0][1];
		
		for(int i=1;i<n;i++) {
			if(end>=arr[i][0]) {
				end= Math.max(end,arr[i][1]);
				//break;
			}
			else {
				System.out.println(start + " "+ end);
				start = arr[i][0];
				end = arr[i][1];
			}
		}
		
		System.out.println(start + " "+ end);
		
	}
}
