/*
 * Question2
 * Author: Peña Ugarte David Jose
 * CUI: 20130875
 */
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = sc.nextInt();
		numberListDesc(n);
	}
	
	public static void numberListDesc(int n) {
		
		for (int i = n; i > 0; i--) 									
			System.out.println(i);
		}   						
	}
	//|O(n)		|= O(1) * 0(n)
	//|		|= O(n)	
	//Time complexity = O(n)
}
