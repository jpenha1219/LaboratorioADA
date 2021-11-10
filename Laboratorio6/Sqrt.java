/*
 * Sqrt
 * Author: Peña Ugarte David Jose
 * Hay cuadrado
 * CUI: 20130875
 */

import java.util.Scanner;

public class Sqrt{
        public static void main (String[]args){
                int [] lista = {2, 13, 16, 4, 9, 14, 19};
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese un numero");
                int num = sc.nextInt();
                System.out.println("¿Hay?: " + binarySearch(num));
        }

        public static int binarySearch(int [] arr , int value){
                int low = 0;
                int high = arr.length-1;
                while(low <= high){
                        int middle = ( low + high ) / 2;
                        if(arr[middle]*arr[middle] == value){
                                return middle;
                        }
                        else{
                                if(value < arr[middle]){
                                        high = middle - 1;
                                } else {
                                        low = middle + 1;
                                }
                        }
                }
                return -1;
        }
}
