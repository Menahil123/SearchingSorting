import java.util.*;
public class MergeSortedArray {
    public static void merge(int[]a, int[]b){
        int m=a.length;
        int n=b.length;
        for (int i = m - 1, j = 0; i >= 0 && j < n; i--, j++) {
            if (a[i] > b[j]) {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
            } else {
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] a = {2, 7, 9, 10, 13, 20};
        int[] b = {1, 3, 6, 25};
        merge(a, b);
        System.out.println("a[] = " + Arrays.toString(a));
        System.out.println("b[] = " + Arrays.toString(b));
        sc.close();
    }
}
