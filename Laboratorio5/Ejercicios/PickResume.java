/*
 * PickResume
 * Author: Peña Ugarte David Jose
 * CUI: 20130875
 */

import java.util.Scanner;

/*
 * Ejercicio - E014
 * Author: Nohelia Estefhania Tacca Apaza
 * Description: Review of Time Complexity --> Pick Resume
 * Question: What is the time complexity of method (pick_resume)?
 * Answer: The time complexity is O(Log2(n))
 * Date	  : 31/10/2021
 */

public class PickResume {
	public static void main(String[] args) {
		String resumes;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cadena completa :");
		resumes = sc.nextLine();

		pick_resume(resumes);
		

	}
	public static String pick_resume(String resumes) {
		
		String eliminate = "top";		
		while(resumes.length() > 1) {
			System.out.println(resumes);
			if (eliminate.equals("top")) {				
				resumes = resumes.substring(resumes.length() / 2, resumes.length());//-1
				eliminate = "bottom";
			}			
			else if (eliminate.equals("bottom")) {		
				resumes = resumes.substring(0, resumes.length() / 2);
				eliminate = "top";				
			}			
		}		
		return resumes.substring(0);		
	}
 /*
 *  resumes.length
 * ----------------
 *    n / 2 ^ 1	   
 *    n / 2 ^ 2	     
 *    n / 2 ^ 3
 *    n / 2 ^ 4	   
 *      ...
 *    n / 2 ^ k
 * 
 * Reemplazando en condicion: resumes.length > 1
 * 
 *    n / 2 ^ k > 1
 *    		  n > 2 ^ k
 *    	Log2(n) > k
 *    
 * Entonces es O(Log2(n))
 * 
 */       
        
}
