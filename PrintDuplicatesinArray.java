package week1.day2;

public class PrintDuplicatesinArray {
	
	public static void main(String[] args) {
		
		int [] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int size = arr.length;
		
		int count;
		
		for(int i=0; i<size-1; i++) {
			
			count=0;
			
			for (int j=i+1; j<size; j++) {
				
				if(arr[i]==arr[j]) {
				
				count++;
			}
			
			if(count>0) {
				System.out.println("The duplicate number is " + arr[i]);
			}
		}
	}

}
}
