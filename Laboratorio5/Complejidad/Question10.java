/*
 * Question10
 * Author: Peña Ugarte David Jose
 * CUI: 20130875
 */
import java.util.*;

public class Question10 {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();
		numberListAsc(n);
	}
	
	public static void numberListAsc(int n) {	
		for (int i = 0; i < n; i++) {			
			System.out.println(i);	 	
		}   
		for (int i = 0; i < n; i++) {				
			System.out.println(i);	
		}   					
	}
        
        //|O(n)		|= O(1) * 0(n)				|
        //|		|= O(n)					|= O(n) + O(n)
        //|	        |Time complexity = O(n)			|= O(2n)
        //|O(n)   	|= O(1) * 0(n)				|= O(n)
        //|		|= O(n)					|
        //|		|					|Time complexity = O(n)
        //Time complexity = O(n)
}
