/*
 * Question4
 * Author: Peña Ugarte David Jose
 * CUI: 20130875
 */

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = sc.nextInt();
		twoNumbers(n);
	}

	public static void twoNumbers(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
			System.out.println(i + " - " + j);
			}
		}   
	}												
      //|= O(n)	  	      			
      //|= O(1)*0((n+1)/2)	|= O(n) * 0(n)
      //|= O(n/2)		|
      //= O(1)	 		|= O(n)			|= O(n²)
      //Time complexity = O(n²)
}
