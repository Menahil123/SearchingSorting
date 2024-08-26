import java.util.*;
public class PermuteArrays {
    public static boolean PermuteArrays(int[] A, int[] B, int K) {
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0; // Start pointer for "A"
        int j = B.length - 1; // Start pointer for "B" (End of B)

        while (i < A.length && j >= 0) {
            if (A[i] + B[j] >= K) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrays:");
        int n = sc.nextInt();

        int[] A = new int[n];
        System.out.println("Enter elements of array A:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int[] B = new int[n];
        System.out.println("Enter elements of array B:");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        System.out.println("Enter the value of K:");
        int K = sc.nextInt();
        boolean result = PermuteArrays(A, B, K);

        if (result)
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println("Trying permutations of array B...");

        boolean permResult = false;
        Arrays.sort(B);
        do {
            if (PermuteArrays(A, B, K)) {
                permResult = true;
                break;
            }
        } while (nextPermutation(B));

        if (permResult)
            System.out.println("Yes, a permutation of B satisfies the condition.");
        else
            System.out.println("No permutation of B satisfies the condition.");
    }
    // Function to generate the next permutation of array B
    public static boolean nextPermutation(int[] array) {
        int i = array.length - 2;

        while (i >= 0 && array[i] >= array[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = array.length - 1;
        while (array[j] <= array[i]) {
            j--;
        }

        swap(array, i, j);
        reverse(array, i + 1, array.length - 1);
        return true;
    }
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }
}
