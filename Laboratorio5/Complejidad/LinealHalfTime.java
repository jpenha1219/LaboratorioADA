/*
 * LineaL Half Time
 * Author: Peña Ugarte David Jose
 * CUI: 20130875
 */

public class LinealHalfTime {
	
	public static void main(String[] args) {
		
		linealHalfTime(25);
		linealHalfTime(50);
		linealHalfTime(100);
		
	}
	
	public static void linealHalfTime(int n) {
				
		int repeats = 0;
	
		for(int i = 0; i < n; i = i + 2) {	
			repeats++;	
		}	
		System.out.println("Repeticiones: " + repeats);
		System.out.println();
  }
  
  //COMPLEJIDAD O(n/2)
}
