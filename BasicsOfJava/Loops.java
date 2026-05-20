package Basics;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		//To Print No from 1-5:
		
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//		System.out.println("4");
//		System.out.println("5");  //Insteading of printing like this we use loops
		
		//1. for-loop
		/* Syntax
		    for(initialization;condition;increment/decrement){
		         //body
		    }
		 */
		for(int i=1;i<=5;i++) {
			System.out.print(i+" ");
		}
		
		//2. while-loop
		/*  Syntax 
		    initialization
		    while(condition){
		       //body
		       //increment/decrement
		    }
		 */
		System.out.println();
		int i=1;
		while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
		
		//3. do-while loop
		
		System.out.println();
		int j=1;
		do {
			System.out.println(j+" ");
			j++;
		}while(j<=5);
		
		//Problem3: Finding Maximum Number
		
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
	
		//Approach1
//		int max=a;
//		if(b>a) {
//			max=b;
//		}
//		if(c>max) {
//			max=c;
//		}
		
		//Approach2
//		int max=Math.max(a,Math.max(b,c));
		
		//Approach3
		int max;
		if(a>b && a>c) {
			max=a;
		}
		else if(b>a && b>c) {
			max=b;
		}
		else {
			max =c;
		}
		System.out.println(max);
		
		//Problem 4: CaseCheck
		
		System.out.println("Entear a String");
		char str=scn.next().trim().charAt(0);
		if(str>'A' && str<'Z') {
			System.out.println("Upper-Case");
		}else {
			System.out.println("Lower-Case");
		}  
		
	    //Problem 5: Conting Occurance 
		int n=76555655;
		int count=0;
		while(n>0) {
			int rem=n%10;
			if(rem==5) {
				count++;
			}
			n/=10;
		}
		System.out.println(count);
		
		//Problem 6:Reversing a Number
		int num=12345;
		int ans=0;
		while(num>0) {
			int rem=num%10;
			ans=ans*10+rem;
			num/=10;
		}
		System.out.println(ans);
	}
}
