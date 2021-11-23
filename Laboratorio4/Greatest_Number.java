import java.util.*;

// David Peña Ugarte
// 20130875
//Ejercicio de el mas grande
// Complejidad O(n)

public class Greatest_Number {
	public static void main(String[] args) {
		int n;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad:");
		n=sc.nextInt();
		int [] array=new int[n];	 
		System.out.println("Lista de Números:");
		for(int i=0;i<=array.length-1;i++) {
			array[i]=s.nextInt();		
		}
		
		System.out.println("El mas alto e : "+ greatestNumber(array));	 
	}		
	
	// Metodo para devolver el numero mas grande
	public static int greatestNumber(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;	
	}
}
