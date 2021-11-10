/*
 * Question12
 * Author: Peña Ugarte David Jose
 * CUI: 20130875
 */

import java.util.Scanner;

public class Question12 {
        
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = sc.nextInt();
		twoNumbers(n);
	}

	public static void twoNumbers(int n) {
		for (int i = 0; i < n; i++) {				
			for (int j = 1; j < n; j = j * 2) {
				System.out.println(i + " - " + j); 
			} 
		}
	}
        
        //| O(n)         	| (1)
        //| O(log_2(n)) 	|= O(n) * O(log_2(n)) (3)
        //| O(1)		| 			|= O(nlog_2(n))
        //Time complexity = O(nlog(n))
  
}
