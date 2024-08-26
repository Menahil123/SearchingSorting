import java.util.*;
public class SearchInString {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name="Menahil Dastgir";
        char target= 'e';
        System.out.println(search(name, target));
    }
    public static boolean search(String str, char target){
        if (str.length()==0){
            return false;
        }
        for (int i=0; i<str.length(); i++){
            if (target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
