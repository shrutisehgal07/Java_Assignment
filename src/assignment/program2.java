/*
 * In a program, input 3 numbers : compute the average of three numbers
 */

package assignment;

import java.util.Scanner;

public class Program2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of the first numbers");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the value of the second numbers");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the value of the third numbers");
		int num3 = sc.nextInt();
		
		
		double avg= (num1+num2+num3)/3;
		
		System.out.println(avg);
	
	

}

}
