package Arrays;

import java.util.Arrays;

public class BasicProblems {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
//      Swaping elements in an arrray
//		swap(arr,0,4);
//		System.out.print(Arrays.toString(arr));
		
//   Finding Maximum Element in array
//		System.out.print(Max(arr));
		
//    reversing a array
	  rev(arr);
	  System.out.print(Arrays.toString(arr));
	}
//	static void swap(int[] arr,int index1,int index2) {
//		int temp=arr[index1];
//		arr[index1]=arr[index2];
//		arr[index2]=temp;
//	}
	
//	static int Max(int[]  arr) {
//		int max=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>max)
//				max=arr[i];
//		}
//		return max;
//	}

	static void rev(int[] arr) {
		int s=0;
		int e=arr.length-1;
		while(s<e) {
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
            s++;
            e--;
		}
	}
}
