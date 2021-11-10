/*
 * FindNeedle
 * Author: Peña Ugarte David Jose
 * CUI: 20130875
 */

public class Find_Needle {
	
	public static void main(String[] args) {
		
		String sequence1 = "xcv";
		String sequence2 = "abcdxcvefghi";
                boolean rpta = find_needle(sequence1, sequence2);
                System.out.println("¿Se encuentra? "+rpta );
		
	}
	
	public static boolean find_needle(String needle, String haystack) {
		
		int needle_index = 0;
		int haystack_index = 0;
		
		boolean found_needle = false;

		while(haystack_index < haystack.length()) { 
		
			if(needle.charAt(needle_index) == haystack.charAt(haystack_index)) {	
				found_needle = true;
                                
				while(needle_index < needle.length()) {
				
					System.out.println("Haystack = " + haystack.charAt(haystack_index));
					System.out.println("Needle = " + needle.charAt(needle_index));
					
					if(needle.charAt(needle_index) != haystack.charAt(haystack_index + needle_index)) {						
						found_needle = false;
						break;	
					}	
					needle_index++;	
				}
				if(found_needle) {
					return true;
				}
				
			}
			needle_index = 0;
			haystack_index++;	
		}
		return false;
         }
 /*
 * n = haystack.length 
 * m = needle.length
 * 
 * tenemos que:
 * primer ciclo = O(n)
 * segundo ciclo = O(m)
 * 
 * Finalmente
 * O(n) * O(m) = O(n*m) 
 */
}
