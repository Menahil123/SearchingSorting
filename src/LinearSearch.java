import java.util.*;
public class LinearSearch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int [] nums={9,4,8,5,2,-18,14,7,-11,8};
        int target=-7;
        int ans= LinearSearch(nums, target);
        System.out.println(ans);
    }
    //search in the array; return the index if found the item
    //if item  not found return -1
    public static int LinearSearch(int [] arr, int target ){
        if (arr.length==0){
            return -1;
        }
        for (int index=0; index <arr.length; index++){
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
