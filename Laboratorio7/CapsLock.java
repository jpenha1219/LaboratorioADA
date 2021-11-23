/*
 * CapsLock
 * Author: Peña Ugarte David Jose
 * Elimina caracteres especiales.
 * CUI: 20130875
 */

import java.util.LinkedList;
import java.util.Queue;

public class CapsLock {
	public static void main(String[] args) {
		String s = "abc$d@ef$@g$";
		String r = CapsLok(s);
		System.out.println(r);
	}
	
	public static String  CapsLok(String s)
	{  		
		Queue<Character> queue = new LinkedList();
		String resultado = "";
		boolean bafer = false;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!='$' && s.charAt(i)!='@') {
				queue.add(s.charAt(i));
			}
			else{
				if(s.charAt(i)=='@') {
					bafer = !bafer;
				}
				else {
					if(bafer) {
                       queue = Inverso_Mayuscula_Minuscula(queue);
					}
					while(!queue.isEmpty()) {
						resultado =resultado+ queue.peek()+"";
						queue.poll();
					}
				}
			}
		}
		return resultado;
	}

	
	public static Queue<Character> Inverso_Mayuscula_Minuscula(Queue<Character> queue_to_change){ 

		Queue queue = new LinkedList();
		while(!queue_to_change.isEmpty()){ 
			char dato=queue_to_change.peek(); 
			String s = String.valueOf(dato);
			if((int)dato>97) {
				s=s.toUpperCase();				
			}
			else {
				s=s.toLowerCase(); 
			}

			char listo = s.charAt(0);
			queue.add(listo);
			queue_to_change.poll(); 
		} 
		return queue;
	} 
}
