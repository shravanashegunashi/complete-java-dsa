package Basics;

import java.util.Scanner;

public class SwitchAndNestedSwitch {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
//		int num=scn.nextInt();
		
//		switch(num) {
//		case 1:
//			System.out.println("One");
//			break;
//		case 2:
//			System.out.println("Two");
//			break;
//		case 3:
//			System.out.println("Three");
//			break;
//		default:
//			System.out.println("Invalid Number");
//		}
		
		//Witout Break
		
//		String season=scn.next();
//		switch(season) {
//		case "Summer":
//			System.out.println("Feb-May");
//			break;
//		case "Rainy":
//			System.out.println("June-Sept");  //If we dont add break it will  execute all cases until break found 
//		case "Winter":
//			System.out.println("Octo-Jan");
//		default:
//			System.out.println("May Be Autumn");
//		}
		
		//Nested-switch
		int EmpNo=scn.nextInt();
		String Job=scn.next();
		switch(EmpNo) {
		case 101:
			System.out.println("Alice");
			break;
	    case 102:
			System.out.println("Carol");
			break;
		case 103:                             
			System.out.println("Joe");
			switch(Job) {
			case "Manager":
				System.out.println("bank-manager");
				break;
			case"Sales-Person":
				System.out.println("Sales-man");
				break;
			default:
				System.out.println("invalid job");
			}
            break;
		default:
			System.out.println("invalid Id");
		}
		
	}

}
