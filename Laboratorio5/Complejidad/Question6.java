/*
 * Question6
 * Author: Peña Ugarte David Jose
 * CUI: 20130875
 */
 
import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = sc.nextInt();
		triangularNumber(n);
	}

	public static void triangularNumber(int n) {
		int p = 0; 				  							
		for (int i = 1; p <= n; i++) {				
			p = p + i;				 	
			System.out.println(p);	 	
		}   							
	}
        
         /*Assume k > n
        p = k * (k + 1) / 2
               p > n
        k * (k + 1) / 2 > n
        k^2 > n
        k > sqrt(n)
        Complejidad  = O(n^(1/2))*/
}	
