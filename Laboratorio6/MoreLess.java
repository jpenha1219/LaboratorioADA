/*
 * MoreLess
 * Mas pequeño
 * Author: Peña Ugarte David Jose
 * CUI: 20130875
 */
 
public class MoreLess{
       public static void main (String[]args){
            int [] lista = {4,5,6,1,13,17,19};
            System.out.println("Elemento mas pequeño: " + (binarySearch(lista)));
        }

        public static int binarySearch(int [] arr){
            int low = 0;
            int high = arr.length - 1;
            int mid;
            while (low < high) {
                mid = low + ((high - low) / 2);
                if (arr[mid] > arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return arr[low];
        }
}
