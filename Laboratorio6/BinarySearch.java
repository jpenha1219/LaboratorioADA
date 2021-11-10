/*
 * BinarySearch
 * Author: Peña Ugarte David Jose
 * CUI: 20130875
 */

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] lista = { 1, 5, 7, 9, 11, 14, 20, 21};
		int num = 20;
		
		System.out.println(binarySearch(lista, num));
	}
	
	public static int binarySearch(int[] a, int search) {
		
		int left = 0;
		int right = a.length - 1;
		int mid;
		
		while(left <= right) {
			
			mid = left + (right - left)/2;			
			if(a[mid] == search) {
				System.out.print("Encontrado ");
				return a[mid];
			} else if (a[mid] < search) {
				left = mid + 1;	
			} else {
				right = mid - 1;	
			}
		}
		return -1;	
	}
}
