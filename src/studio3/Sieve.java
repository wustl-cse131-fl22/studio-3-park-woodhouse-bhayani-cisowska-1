package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		
		System.out.print("Enter number: ");
		int n = in.nextInt();
		boolean[] array = new boolean[n+1];
		
		for (int x=2; x<n+1; x++) {
			array[x] = true;
			
			for (double y = 2; y<n+1; y++) {
			double remain = x % y;
			double divide = x/y;
				if (remain == 0 && divide != 1) {
					array[x] = false; 
				} 
			
				
			} 
		}
		
	
			for (int a=0; a<n+1; a++) {
				
				if (array[a] == true) {
					System.out.println(a);
				}
		

	}

}
}
