import java.util.*;
public class ZeroSum {
    public static void ZeroSum(int[] arr) {
        int n = arr.length;
        // Iterate through all possible starting indices of subarrays
        for (int start = 0; start < n; start++) {
            int sum = 0;
            /* Iterate through all possible ending indices for the current starting
             index */
            for (int end = start; end < n; end++) {
                sum += arr[end];
                if (sum == 0) {
                    printSubarray(arr, start, end);
                }
            }
        }
    }
    private static void printSubarray(int[] arr, int start, int end) {
        System.out.print("Subarray with zero sum: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {3, -1, -2, 1, 2, -1, 7};
        ZeroSum(arr);
    }
}

