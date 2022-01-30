package week1.day2;

import java.util.Arrays;

public class MissingElementsinArray {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,8};
		Arrays.sort(arr);
		
		int size = arr.length;
		
		System.out.println(size);
		
		for(int i=arr[0]; i<=arr.length; i++) {
			
			if(i!=arr[i-1]) {
				System.out.println("The missing number is " + i);
				
			break;
			}
					
			 
		}
	}

}
