/*
 *  In a program, input the side of a square. You have to output the area of the square
 */

package assignment;

import java.util.*;
public class Program1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the side of the square");
		
		int side = sc.nextInt();
		
		double area= side*side;
		
		System.out.println(area);
	}
	

}
