/*
 * LineaL Time TwooLoops
 * Author: Peña Ugarte David Jose
 * CUI: 20130875
 */

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = sc.nextInt();
		numberListAsc(n);
	}
	
	public static void numberListAsc(int n) {

		for (int i = 0; i < n; i++) {													
			System.out.println(i);	 				
		}   								
	}
	//|O(n)		|= O(1) * 0(n)
	//|		|= O(n)
	//|		|
	//Time complexity = O(n)
}
