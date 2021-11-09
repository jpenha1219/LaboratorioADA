/*
 * LineaL Time TwooLoops
 * Author: Peña Ugarte David Jose
 * CUI: 20130875
 */

import java.util.Scanner;



public class LinealTimeTwoLoops {
  
	public static void main(String[] args) {
    
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = sc.nextInt();

		System.out.println("Ingrese en el rango ");
		twoNumbers(n);
	}

	

	public static void twoNumbers(int n) {
		//pares de numeros que se pueden formar con los numeros entre 0 y n-1	
									//__				    ____
		for (int i = 0; i < n; i++) {				//  | O(n)    __			|
			for (int j = 0; j < n; j++) {			//  |		|			|
									//  |		| O(1) * 0(n)		| O(n) * 0(n)
			System.out.println(i + " - " + j);	= O(1)  //  |		| O(n)			| O(n²)
			}						//  |  	      __|			|
		}   							//__|				    ____|
	}								//		Complejidad = O(n²)																	
}	
