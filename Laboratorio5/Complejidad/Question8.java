/*
 * Question8
 * Author: Peña Ugarte David Jose
 * CUI: 20130875
 */

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = sc.nextInt();
		entreDos(n);
	}

	public static void entreDos(int n) {
		for (int i = n; i >= 1; i = i/2) {					
			System.out.println(i);	
		} 				
	}
        //|O(2^(n))		|= O(1) * 0(2^(n))
        //|			|= O(2^(n))
        //|= O(1)			|			|= O(log_2(n))
        //Time complexity = O(log_2(n))	
}	
