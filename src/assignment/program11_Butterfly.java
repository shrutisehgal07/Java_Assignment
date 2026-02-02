/*
print below pattern
*          *
**        **
***      ***
****    ****
*****  *****
************
************
*****  *****
****    ****
***      ***
**        **
*          *
 */

package assignment;

import java.util.*;
public class program11_Butterfly {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the length");
	
	int n= sc.nextInt();
	
	int space= 2*n-2;
	int len= 2*n;
	int star=0;
	
	for(int i=0;i<len;i++) {
		if(i<n) {
			space = space-2;
			star++;
		}
		

		else {
			space = space + 2;
			star--;
		}
		
		for(int j=0;j<star;j++) {
			System.out.print("*");
		}
		
		for(int k=0;k<space;k++) {
			System.out.print(" ");
		}
		
		for(int j=0;j<star;j++) {
			System.out.print("*");
		}
		if(i<n-1) {
			space = space-2;
		
		}
		

		else {
			space = space + 2;
		}
		
		System.out.println();
	}
	}
	
}
