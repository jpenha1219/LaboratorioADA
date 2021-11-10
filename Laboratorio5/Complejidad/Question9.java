/*
 * Question9
 * Author: Peña Ugarte David Jose
 * CUI: 20130875
 */

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = sc.nextInt();
		rootMethod(n);
	}

	public static void rootMethod(int n) {
		for (int i = 0; i * i < n; i++) {						
			System.out.println(i);	
		}				
	}
        //|O(sqrt(n))		|= O(1) * 0(sqrt(n))
        //|			|= O(sqrt(n))
        //Time complexity = O(sqrt(n))	
}	
