/*
 * InterViewWait
 * Author: Peña Ugarte David Jose
 * Calculo del tiempo de espera para la entrevista
 * CUI: 20130875
 */


public class InterViewWait {

	public static void main(String[] args) {

		int[] lista = { 4, -1, 5, 2, 3 };
		interviewVait(lista
	}


	private static void interviewVait(int[] array) {

		Deque<Integer> deque = new LinkedList<Integer>();

		for (int i = 0; i < array.length; i++) {
			deque.addLast(array[i]);
		}

		System.out.println("Input : " + deque);

		int time = 0;
		while (true) {
			if (deque.peek() == -1 || deque.peekLast() == -1) {
				break;
			}
			if (deque.peek() < deque.peekLast()) {
				time += deque.pollFirst();
			} else {
				time += deque.pollLast();
			}
		}
		System.out.println("Ouput : " + time);
	}
}
