/*
 Print below pattern
   *
  ***
 *****
*******
 *****
  ***
   *
 */

package assignment;

import java.util.Scanner;

public class program6_Diamond {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value");
	
	int n= sc.nextInt();
	
	//int space;
	
	for(int i=0;i<n;i++) {                       // for upper block
		
		for(int j=0; j<n-i; j++) {      // for spaces 
			System.out.print(" ");
		}
		
		for(int k=0; k<2*i-1;k++) {        // for stars
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int i= n-2; i>0;i--) {           // for lower block
		
		for(int j=0; j<n-i; j++) {      // for spaces 
			System.out.print(" ");
		}
		
		for(int k=0; k<2*i-1;k++) {        // for stars
			System.out.print("*");
		}
		System.out.println();
	}
	
}
}
