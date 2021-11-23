/*
 * Question3
 * Author: Peña Ugarte David Jose
 * Encuentre el mayor o Igual
 * CUI: 20130875
 */

import java.util.Scanner;

public class MayorIgual{
        
        public static void main (String[]args){
                
                int [] arr = {3, 5, 19,25,24,19,10,100};
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese un Numero");
                int num = sc.nextInt();
                System.out.println("¿Hay?: " + (binarySearch(arr, num)));
        }

        public static int binarySearch(int [] arr , int value){
                
                int low = 0;
                int high = arr.length-1;
                int middle = 0;
                while(low <= high){
                        middle = ( low + high ) / 2;
                        if(arr[middle] == value){
                                return arr[middle + 1];
                        }
                        else{
                                if(value < arr[middle]){
                                        high = middle - 1;
                                }
                                else {
                                        low = middle + 1;
                                }
                        }
                }
                return arr[middle];
        }
}
