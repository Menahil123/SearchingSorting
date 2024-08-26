import java.util.*;
import java.util.Arrays;
public class MedianOfTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = mergeArrays(nums1, nums2);
        // Find the median of the merged array
        int length = mergedArray.length;
        if (length % 2 == 1) {
            // If the length of the merged array is odd, return the middle element
            return mergedArray[length / 2];
        } else {
            /* If the length of the merged array is even, return the average of the
             two middle elements */
            return (mergedArray[length / 2 - 1] + mergedArray[length / 2]) / 2.0;
        }
    }

    private static int[] mergeArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            mergedArray[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            mergedArray[k++] = nums2[j++];
        }
        return mergedArray;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums1 = {1, 3, 8};
        int[] nums2 = {7, 9, 10, 11};
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("The median is: " + median);
    }
}

