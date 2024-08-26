import java.util.*;
public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {4, 8, 5, 2, -18, 11, 9, -11, 8};
        int target = -7;
        System.out.println(Searching(nums, target, 1, 5));
        sc.close();
    }
    public static int Searching(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
