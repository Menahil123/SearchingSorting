import java.util.*;
public class CountInversion {
    public static int CountInversion(int[]arr){
        int n=arr.length;
        int InvCount=0;
        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i]>arr[j]){

                }
            }
        }
        return InvCount;
    }
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int [] arr={9,7,1,8,4};
        int result=CountInversion(arr);
        System.out.println("Inversion Count:"+result);
    }
}
