/*
 * Question4
 * Author: Peña Ugarte David Jose
 * CUI: 20130875
 */

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = sc.nextInt();
		twoNumbers(n);
	}

	public static void twoNumbers(int n) {
		//						      __					    ____
		for (int i = 0; i < n; i++) {//				|= O(n)	  	      __			|
			for (int j = 0; j < i; j++) {//						|= O(1)*0((n+1)/2)	|= O(n) * 0(n)
			//statement								|= O(n/2)		|
			System.out.println(i + " - " + j);	//= O(1)			|= O(n)			|= O(n²)
			}//								      __|			|
		}   //						      __|					    ____|Time complexity = O(n²)
	}//												
      //|= O(n)	  	      			
      //|= O(1)*0((n+1)/2)	|= O(n) * 0(n)
      //|= O(n/2)		|
      //= O(1)	 		|= O(n)			|= O(n²)
      //Time complexity = O(n²)
}
