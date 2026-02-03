/*
 * Compress a string in the below format
Input: -> "aaabbcccdd" Output: -> "a3b2c3d2"
 */

package assignment;

import java.util.Scanner;

public class Program4 {
	
	public static void main(String[] args) {
		
		String str= "aaabbcccdd";
		
		StringBuilder compress = new StringBuilder();
		
		int n= str.length();
		int count=1;
		
		for(int i=0;i<n;i++) {
			
			char ch= str.charAt(i);
			if(i+1<n && ch== str.charAt(i+1)) {
					count++;
				}
			else {
				compress.append(ch).append(count);
				count=1;
			}
			
			
		}
		System.out.print(compress);
		
		
	}
	

}
