/*
 * Question3
 * Author: Peña Ugarte David Jose
 * CUI: 20130875
 */

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = sc.nextInt();
		parNumberList(n);
	}
	
	public static void parNumberList(int n) {
		for (int i = 0; i < n; i = i+2) {
			System.out.println(i);	
		}  	
	}
  //|O(n/2)		|= O(1) * 0(n/2)
  //|		      |= O(n)
  //Time complexity = O(n)
}
