import java.util.*;
public class TieRopes {
        public static void main(String args[]){
                int[] a = { 1, 2, 3, 4, 1, 1, 3 };
                System.out.print(solution(4,a));
        }
        public int solution(int K, int[] A) {
                int N = A.length;
                int result = 0;
                int length = 0;
                for (int rope : A) {
                    length += rope;
                    if (length >= K) {
                        result++;
                        length = 0;
                    }
                }
                return result;
        }
}
