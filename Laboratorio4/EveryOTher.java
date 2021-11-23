Import java.util.*;

// David Peña Ugarte
// 20130875
// Identifica los indices pares y suma los valores del arreglo
// Complejidad del algoritmo : O(n^2)

public class EveryOther{
  public static void main (String[]args){
    int [] array = {1, 2, 3, 6, 7};
    for (int i : array) {
      System.out.print(i + ",");
    }    
    System.out.println("\n");
    everyOther(array);

  }

  public static void everyOther(int [] array) {
    for(int i = 0; i < array.length; i++){
      if(i % 2 == 0 ){
        for (int j = 0; j < array.length; j++) {
          System.out.println(array[i] + array[j]);
        }
        System.out.println("\n");
      }
    }
  }
}
