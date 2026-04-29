//package DSA-JAVA.linear-search;
import java.util.*;
class Search {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your target num: ");
        int target = in.nextInt();
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int [] arr = {};
        // int target = 8;
        int ans = search(arr,target);
        System.out.println(ans);

    }
    
    static int search(int [] arr,int target){
        if(arr.length == 0 ){
            return Integer.MIN_VALUE;
        }
        for(int i=0; i<=arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }   
}
