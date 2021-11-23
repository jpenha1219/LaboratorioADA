import java.util.*;

// David Peña Ugarte
// 20130875
// Ejercicio para Saber si dos numeros suman 10
// Complejidad del algoritmo : O(n^2) 
public class TwoSum {
	public static void main(String[] args) {
		int n;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cantidad de numeros:");
		n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Lista de Números:");
		for (int i = 0; i <= array.length - 1; i++) {
			array[i] = s.nextInt();
		}

		System.out.println("Encontro Suma " + twoSum(array));
	}

	// Metodo para verificar si existe la suma de 10 entre dos numeros
	public static boolean twoSum(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i != j && (array[i] + array[j]) == 10) {
					return true;
				}
			}
		}
		return false;

	}
}
