import java.util.*;
public class MaxSubsequenceSum {
    public static int rec(int[] nums, int idx, int N, int[] memo) {
        if (idx >= N)
            return 0;
        if (memo[idx] != -1)
            return memo[idx];
        /* Recursively calculate the maximum sum including or excluding the current
         element*/
        int include = nums[idx] + rec(nums, idx + 2, N, memo);
        int exclude = rec(nums, idx + 1, N, memo);
        // Store the result in the memo array
        memo[idx] = Math.max(include, exclude);
        return memo[idx];
    }
    static int findMaxSum(int[] arr, int N) {
        int[] memo = new int[N];
        Arrays.fill(memo, -1);
        return rec(arr, 0, N, memo);
    }
    public static void main(String [] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr = {5, 5, 10, 100, 10, 5};
        int N = arr.length;
        System.out.println(findMaxSum(arr, N));
        sc.close();
    }
}

/* "Memoization" where a function is called repeatedly with the same arguments,
leading to the same output. Instead of recalculating the result each time, the
function's output is stored in a cache, and subsequent calls with the same inputs
retrieve the cached result.*/

