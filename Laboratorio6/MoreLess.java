/*
 * MoreLess
 * Mas pequeño
 * Author: Peña Ugarte David Jose
 * CUI: 20130875
 */
 
public class MoreLess{
        public static void main (String[]args){
                int [] lista = {5,3,1,10,13,11,9};
                System.out.println("¿Hay?: " + (binarySearch(lista)));
        }

        public static int binarySearch(int [] arr){
                int low = 0;
                int high = arr.length-1;
                int middle = 0;
                while(low <= high){
                        System.out.println("entre a while");
                        middle = ( low + high ) / 2;
                        if(arr[low] < arr[middle]){
                                low = middle + 1;
                        }
                        else{
                                high = middle - 1;
                        }
                        if(low == high){
                                return arr[middle];
                        }
                }
                return arr[middle];
        }
}
