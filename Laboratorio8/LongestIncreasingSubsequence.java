import java.util.*;

public class LongestIncreasingSubsequence{
        public static void main(String args[]){
                int []nums =  [0,1,0,3,2,3];
                System.out.print(lengthOfLIS(nums));
        }
        
        public int lengthOfLIS(int[] nums) {
                int[] dp = new int[nums.length];
                Arrays.fill(dp, 1);

                for (int i = 1; i < nums.length; i ++) {
                    for (int j = 0; j < i; j++) {
                        if (nums[j] < nums[i]) {
                            dp[i] = Math.max(dp[i], dp[j] + 1);
                        }
                    }
                }

                int max = Integer.MIN_VALUE;
                for (int num : dp) {
                    max = Math.max(num, max);
                }
        
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
