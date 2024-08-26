import java.util.*;
import java.util.Scanner;
public class CountSort {
    public static void countSort(int[] inputArray) {
        if (inputArray.length == 0) {
            return;
        }
        int max = Arrays.stream(inputArray).max().getAsInt();
        int min = Arrays.stream(inputArray).min().getAsInt();
        int range = max - min + 1;
        int[] countArray = new int[range];

        for (int num : inputArray) {
            countArray[num - min]++;
        }
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (countArray[i] > 0) {
                inputArray[index++] = i + min;
                countArray[i]--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputArray = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original array: " + Arrays.toString(inputArray));
        countSort(inputArray);
        System.out.println("Sorted array: " + Arrays.toString(inputArray));
        sc.close();
    }
}
