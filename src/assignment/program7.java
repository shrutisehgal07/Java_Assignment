/*
print below pattern
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */

package assignment;

import java.util.Scanner;

public class Program7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

			for(int i=5;i>0;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
	}
	

}
