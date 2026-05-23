package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[][] arr=new int[3][3];
	
		//Or directly we can store like this
		
		int[][] arr1= {
				       {1,2,3,4},
				       {5,6,6,8},
				       {9,8,7,6}
		              };
		System.out.print(Arrays.deepToString(arr1));
		
		//input
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		
		//output: format1
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//		}
		//Output: format2
		for(int[] el:arr) {
			System.out.print(Arrays.toString(el));
		}
		System.out.println();
		System.out.print(Arrays.deepToString(arr));
		
		System.out.println();
		//If column number is not fixed
		int[][] Arr= {
			       {1,2,3,4},
			       {5,6},
			       {7,8,9}
	              };
		for(int i=0;i<Arr.length;i++) {
			for(int j=0;j<Arr[i].length;j++) {
				System.out.print(Arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
