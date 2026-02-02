/* 
 * Accept salary from user along with choice to calculate tax using Old Tax Regime or New
Tax Regime and calculate the tax for the given salary.
New tax regime slabs:
0 to 250000
Nil
250000 to 500000
5%
500000 to 750000
10%
750000 to 1000000
15%
1000000 to 1250000
20%
1250000 to 1500000
25%
Greater than 1500000
30%
Old tax regime slabs:
0 to 250000
Nil
250000 to 500000
5%
500000 to 1000000
20%
Greater than 1000000
30%
 */

package assignment;

import java.util.Scanner;

public class program5 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the salary");
		double salary= sc.nextDouble();
		
		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		
		double tax=0;
		
		
		switch(choice) {
		 
		case 1: System.out.println("New Tax Regime");
		if(salary>0 && salary<=250000) {
			tax=0;
		}
		else if(salary>250000 && salary<=500000) {
			tax= 0.05 * salary;
		}
		
		else if(salary>500000 && salary<=750000) {
			tax= 0.1 * salary;
		}
		else if(salary>750000 && salary<=1000000) {
			tax= 0.15 * salary;
		}
		else if(salary>1000000 && salary<=1250000) {
			tax= 0.2 * salary;
		}
		else if(salary>1250000 && salary<=1500000) {
			tax= 0.25 * salary;
		}
		else {
			tax= 0.3 * salary;
		}
		break;
		
		case 2: System.out.println("Old Tax Regime");
		if(salary>0 && salary<=250000) {
			tax=0;
		}
		else if(salary>250000 && salary<=500000) {
			tax= 0.05 * salary;
		}
		
		else if(salary>500000 && salary<=1000000) {
			tax= 0.2 * salary;
		}
		else {
			tax= 0.3 * salary;
		}
		break;
		
		default: System.out.println("Invalid Choice");
		break;
		}
		
		System.out.println(tax);
				
	}
}
