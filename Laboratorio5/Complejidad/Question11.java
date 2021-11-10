/*
 * Question11
 * Author: Peña Ugarte David Jose
 * CUI: 20130875
 */
 
import java.util.Scanner;

public class Question11 {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();

		logarithmicMethod(n);
	}

	public static void logarithmicMethod(int n) {	  							
		int p = 0;	
		for (int i = 1; i < n; i = i*2) {					
			p++;
			System.out.println(" i = " + i + ", p = " + p);	
		}  
		for (int j = 1; j < p; j = j*2) {					
			p++;
			System.out.println(" j = " + j + ", p = " + p);	 	
		}   				
	}
        
        //|O(log_2(n))			|
        //|p = O(log_2(n))		|Time complexity = O(log_2((log_2(n)))	
        //|= O(1)	|O(log_2(p))	
        //Time complexity = O(log_2((log_2(n)))	
}	
