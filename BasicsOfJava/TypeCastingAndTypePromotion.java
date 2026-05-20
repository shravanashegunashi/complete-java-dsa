package Basics;

import java.util.Scanner;

public class TypeCastingAndTypePromotion {
	public static void main(String[] args) {
		
        //Conditions for type conversion
        //1. Type should be compatible (like Numbers)
        //2. Destination type should be larger than source type
		
		Scanner in=new Scanner(System.in);
		float n=in.nextFloat();   //input=10 and output=10.0
		System.out.println(n);
		
		//TypeCasting:Narrowing Conversion 
		int num=(int)(78.987f);
		System.out.println(num);  //Compressing bigger number to smaller datatype.
		
		//Automatic Type Promotion in expressions
		int a=257;
//		byte b=(byte)(a);
//		System.out.println(b); 
		
		float b=67.89f;
		double c=87687866.87878;
		long d=5756556565656L;  
		
		System.out.println(a+b+c+d);     //Even though long can large values the rsultant type is double bcz it can hold decimal values.. 
		
		
		//Unicode
		int a1='A';
		System.out.println(a1);
		
		int num2='a';
		System.out.println(num2);
		
		int num3=100;
		System.out.println((char)(num3));
		
		//Problem2: Coverting celsius to fahrenheit
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Temp in C: ");
		float C=scn.nextFloat();
		
		float F=(C*9/5)+32;
		System.out.println("Temp in F is: "+F);
	}
}
