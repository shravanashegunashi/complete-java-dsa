package Arrays;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		//To store a roll number
		int a=10;
		
		//Q: Store a person's name
		String name="Alice";
		
		//Q: Store 5 roll numbers
		int rno1=20;
		int rno2=23;
		int rno3=26;
		int rno4=29;
		int rno5=31;   //But these are repitative so we use array's here
		
		/*  Syntax
		   datatype[] var_name=new datatype[size];
		*/
		//Store 5 roll numbers
		int[] rno=new int[5];
		//or
		int[] rNo= {20,23,26,29,31};  
        //System.out.println(rNo[0]);    //Accessing array element by their indices
		//Using for loop to access the array element
		for(int i=0;i<rNo.length;i++) {
			System.out.print(rNo[i]+" ");
		}
		
		int[] rNo1= {20,23,26,29,'a'};    //Output=[20,23,26,29,97]
		System.out.println(Arrays.toString(rNo1));
		//Array elements are continues? ==> Depends on JVM.
		
		int[] id=new int[2];
		System.out.println(id[0]+" "+id[1]);  //Bydefault array elements points to zero
		
		String[] name1=new String[5];
		System.out.println(name1[0]);      
	}

}

