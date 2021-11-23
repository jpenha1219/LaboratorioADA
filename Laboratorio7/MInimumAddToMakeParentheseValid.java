/*
 * MInimumAddToMakeParentheseValid
 * Author: Peña Ugarte David Jose
 * Evalua y devuelve la cantidad de parentesis que se debe agregar para que la cadena envida sea valida
 * CUI: 20130875
 */

import java.util.Stack;

public class MInimumAddToMakeParentheseValid {
	
	public static void main(String[] args)
	{
		
		String s = "())";
		int a = minAddToMakeValid(s);
		System.out.println(a);
		
		String s2 = "(((";
		int a2 = minAddToMakeValid(s2);
		System.out.println(a2);
		
		String s3 = "(()))(";
		int a3 = minAddToMakeValid(s3);
		System.out.println(a3);
		
		String s4 = "()))((";
		int a4 = minAddToMakeValid(s4);
		System.out.println(a4);
		
	}
	
	public static int minAddToMakeValid(String s) {

		
		int respuesta = 0;
		Stack<Character> pila = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				pila.push(c);
			} else if (c == ')') {
				if (!pila.isEmpty() && pila.peek() == '(') {
					pila.pop();
				} else if (pila.isEmpty()) {
					respuesta++;
				}
			}
		}
		respuesta += pila.size();
		return respuesta;
	}
}
