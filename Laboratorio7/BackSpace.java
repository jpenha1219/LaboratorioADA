/*
 * Sqrt
 * Author: Peña Ugarte David Jose
 * BackSpace
 * Elimina caracteres especiales.
 * CUI: 20130875
 */

public class BackSpace {

	public static void main(String[] args) {
		String txt = "se#esta##probando#si#funciona#bien#";
		backSpace(txt);
	}
	

	
	public static void backSpace(String txt) {
    
		System.out.println("input : " + txt);
		Deque<Character> q = new LinkedList<Character>();
		
		for (int i = 0; i < txt.length(); ++i) {
			if (txt.charAt(i) != '#')
				q.addFirst(txt.charAt(i));
			else if (!q.isEmpty())
				q.removeFirst();
		}
		
		String message = "";

		while (!q.isEmpty()) {
			message += q.removeFirst();
		}

		//mensaje final
		String answer = "";
		for (int j = message.length() - 1; j >= 0; j--) {
			answer += message.charAt(j);
		}
		System.out.println("Ouput : " + answer);
	}
}
