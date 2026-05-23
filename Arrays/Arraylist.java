package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(10);
				
//				list.add(1);
//				list.add(2);
//				list.add(3);
//				list.add(4);
//				list.add(5);
//				list.add(6);
//				list.add(7);
//				list.add(8);
//				list.add(9);
//				list.add(10);
//				list.add(11);
//				list.add(12);
//				list.add(13);
//				list.add(14);
//				System.out.println(list.set(14, null));
//				System.out.println(list);
//				list.remove(14);
//				System.out.println(list.size());
//				System.out.println(list.indexOf(9));
//				System.out.println(list.contains(11));
//				System.out.println(list.isEmpty());
//				System.out.println(list);
				
				Scanner in=new Scanner(System.in);
				
				for(int i=0;i<5;i++) {
					list.add(in.nextInt());
				}
				for(int i=0;i<5;i++) {
		          System.out.println(list.get(i));
		      }
	//	System.out.println(list);
	}
}
