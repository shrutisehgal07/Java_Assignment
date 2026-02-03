
/*
 Spiral Matrix
Input : -> { {1,2,3,4},
{5,6,7,8},
{9,10,11,12},
{13,14,15,16} };

Output: -> 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 */

package assignment;

public class Program8_spiralMatrix {
	
	public static void main(String[] args) {
	
	int input[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	int n= input.length;
	int m= input[0].length;
	
	//int arr[][]= new int[n][m];
	
	int top=0;
	int bottom =n-1;
	int left = 0;
	int right = m-1;
	
	while(top<=bottom && left<=right) {
		
		for(int i= left; i<=right;i++) {
			System.out.print(input[top][i] + " ");
		}
		top++;
		
		for(int j= top;j<=bottom;j++) {
			System.out.print(input[j][right] + " ");
		}
		right--;
		
		if(top<=bottom) {
		for(int i=right;i>=left;i--) {
			System.out.print(input[bottom][i] + " ");
		}
		
		bottom--;
		}
		
		if(left<=right) {
			for(int j=bottom;j>=top;j--) {
				System.out.print(input[j][left] + " ");
			}
		
			left++;
		}
		
	}
	
	
	
	}

}
