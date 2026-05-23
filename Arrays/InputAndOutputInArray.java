package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InputAndOutputInArray {
	public static void main(String[] args) {
		//Array of primitives
		int[] arr=new int[5];
		//Input and output using for loop
		Scanner scn=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
		     arr[i]=scn.nextInt();
		}
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
		//Enhanced for-loop
		for(int el:arr) {
			System.out.print(el+" ");
		}
		
		//Array of objects
		String[] str=new String[5];
		for(int i=0;i<str.length;i++) {
			str[i]=scn.next();
		}
		System.out.println(Arrays.toString(str));
		
//		for(String el:str) {
//			System.out.print(el+" ");
//		}
		
		//Modifying the array
		str[1]="alice";
		System.out.print(Arrays.toString(str));
	}

}
