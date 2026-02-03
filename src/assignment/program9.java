/*
 * Count how many times lowercase vowels occurred in a String by reading a .txt file.
 */

package assignment;

import java.util.*;
import java.io.*;

public class Program9 {
public static void main(String[] args) throws FileNotFoundException {
	
	int count=0;
		
		File file= new File("src/text/program9_Text");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			String line= sc.nextLine();
			
			for(int i=0;i<line.length();i++) {
				char ch= line.charAt(i);
				
				if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
					count++;
				}
			}
		}
		sc.close();
		
		System.out.println("Lower case count: " + count);
		
		
	}
}
