package assignment;

/*
 Given an array nums with n objects colored red, white, or blue, sort
them in-place so that objects of the same color are adjacent, with
the colors in the order red, white, and blue.
 */


import java.util.Scanner;

public class Program14 {
public static void main(String[] args) {
		
		int arr[]= {2,0,2,1,1,0};
		int n=arr.length;
		
		/* 0 is red
		 * 1 is white
		 * 2 is blue
		 */
		
		int countRed=0;
		int countBlue=0;
		int countWhite=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				countRed++;
			}
			
			else if(arr[i]==1) {
				countWhite++;
			}
			else if(arr[i]==2) {
				countBlue++;
			}
		}
		
		int idx= 0;
		
		for(int i=0; i<countRed;i++) {
			arr[idx]=0;
			idx++;
		}
		
		
		
		for(int i= 0;i<countWhite;i++) {
			arr[idx]=1;
			idx++;
		}
		
		for(int i= 0;i<countBlue;i++) {
			arr[idx]=2;
			idx++;
		}
		
		
		System.out.println("The sorted array is: ");
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");
		}
	}

}
