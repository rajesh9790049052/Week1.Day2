package week1.day2;

public class Factorial {
	
	/*
	*What are my learnings from this code?
	 * 1)for loop
	 * 2)while loop
	 * 3)decrement 
	 */
	
	
	public static void main(String[] args) {
		
		int input =5;
		int fact =1;
		
		for(int i=1; i<=input; i++) {
			
			fact=fact*i;
				
		}
		
		System.out.println("Factorial of 5 : " + fact);
		
		int j=5;
		while (j>=1) {
			System.out.println(j  + "*");
			j--;
	}
		System.out.println("is" + fact);
		
	}
	
	

}




