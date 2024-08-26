import java.util.*;
public class Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {1, 3, 5, 7, 8, 9, 4},
                {19, 15, 47, 227},
                {90, 15, 19, 13, 17, 38, 73},
                {31, 84, 2, 10, 16}
        };
        int target = 17;
        int[] ans = search(arr, target);
        if (ans != null) {
            System.out.println("Target found at: " + Arrays.toString(ans));
        } else {
            System.out.println("Target not found.");
        }
        int maxValue = findMax(arr);
        System.out.println("Maximum value in the array: " + maxValue);
        int minValue = findMin(arr);
        System.out.println("Minimum value in the array: " + minValue);
    }
    public static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }
    public static int findMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
    public static int findMin(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] row : arr) {
            for (int element : row) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }
}
