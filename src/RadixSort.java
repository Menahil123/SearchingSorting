import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class RadixSort {
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void radixSort(int[] arr) {
        int max = getMax(arr);
        // Create 10 buckets for each digit (0-9)
        List<Integer>[] buckets = new ArrayList[10];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        // Start sorting by each digit, starting from the least significant digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            // Place each number in the corresponding bucket based on the current digit
            for (int number : arr) {
                int bucketIndex = (number / exp) % 10;
                buckets[bucketIndex].add(number);
            }
            // Collect numbers from the buckets and put them back into the array
            int index = 0;
            for (List<Integer> bucket : buckets) {
                for (int number : bucket) {
                    arr[index++] = number;
                }
                bucket.clear();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = {68, 45, 75, 42, 1000, 24, 20, 30};
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        radixSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

