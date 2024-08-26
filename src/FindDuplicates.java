import java.util.*;
public class FindDuplicates {
    public static void printRepeating(int[]arr, int n) {
        System.out.print("The repeating elements are: ");
        boolean hasDuplicates = false;
        for (int i = 0; i < n; i++) {
            /* Continue swapping until arr[i] is at the correct position, we find
             a duplicate */
            while (arr[i] != i) {
                if (arr[i] == arr[arr[i]]) {
                    System.out.print(arr[i] + " ");
                    hasDuplicates = true;
                    break;
                }
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }
        }
        if (!hasDuplicates) {
            System.out.println("No duplicates found");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = {1, 2, 4, 5, 4, 5, 1};
        int arr_size = arr.length;
        printRepeating(arr, arr_size);
    }
}

