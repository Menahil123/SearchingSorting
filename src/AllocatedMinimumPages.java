import java.util.*;
public class AllocatedMinimumPages {
    private static boolean canAllocate(int[] arr, int n, int m, int maxPages) {
        int stdCount = 1;
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxPages) {
                return false;
            }
            if (currentSum + arr[i] > maxPages) {
                stdCount++;
                currentSum = arr[i];
                if (stdCount > m) {
                    return false;
                }
            } else {
                currentSum += arr[i];
            }
        }
        return true;
    }
    public static int findMinPages(int[] arr, int n, int m) {
        if (n < m) {
            return -1;
        }
        int low = 0, high = 0;
        for (int i = 0; i < n; i++) {
            low = Math.max(low, arr[i]);
            high += arr[i];
        }
        int result = high;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canAllocate(arr, n, m, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr1 = {10, 30, 60, 90};
        int n1 = arr1.length;
        int m1 = 2;
        System.out.println("Minimum pages: " + findMinPages(arr1, n1, m1));

        int[] arr2 = {15, 25, 35};
        int n2 = arr2.length;
        int m2 = 5;
        System.out.println("Minimum pages: " + findMinPages(arr2, n2, m2));
    }
}

