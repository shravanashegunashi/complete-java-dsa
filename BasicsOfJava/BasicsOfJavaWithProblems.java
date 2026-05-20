package Basics;

import java.util.Scanner;

public class BasicsOfJavaWithProblems {
	public static void main(String[] args) {
		
	//Outputs in Java
		
	System.out.println("Welcome to Java World");  //ln: Used to print on next line
    System.out.println(2+3);                      //Perform Simple Maths
    System.out.println("2+3");                    //If we use double quotation mark it prints content as it is
    System.out.println(2+3+"Hello");              //It will do calculation first then print the msg (Left to Right)
    System.out.println("Hello"+2+3);              //First prints msg then simply joints numbers it won't calculate them
    
    //Inputs in Java
    
    Scanner scn=new Scanner(System.in);          //for input we need Scanner class
    System.out.println("Enter a number: ");
    int n=scn.nextInt();
    System.out.println("The Number You have entered is: "+n);
    
    System.out.println("Enter a Name: ");
    String name=scn.next();
    System.out.println("The Name You have entered is: "+name);
    
    //DataTypes (Primitives):
   //datatype literals=values;
    
    int num=101;  
    char alpha='s';
    float marks=99.99f;   //In float Values Are Not Accurate
    double largeDecimalValues=973897859.97;
    long largeIntValues=6528658275788778L;   //integer can store upto 4 bytes so to store higher values we use long having size 8 bytes
    boolean check=true; //false
    
    
    //Non-Primitive: Can Break into further other datatypes(characters)
    
    String Name="Alice"; 
    
    //Wrapper Class
    
    Integer rNo=90;
    rNo.compareTo(rNo);
    System.out.println(rNo);
    
    //Problem1:Taking Input from users and Finding Sum Of those numbers
    
    System.out.println("Enter First Number: ");
    int num1=scn.nextInt();
    System.out.println("Enter Second Number: ");
    int num2=scn.nextInt();
    
    int sum=num1+num2;
    System.out.println("Sum = "+sum);
    
	}
}
