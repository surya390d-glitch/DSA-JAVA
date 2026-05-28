import java.util.*;
public class Linear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter the arrays: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        
        System.out.println(Arrays.toString(arr));// no loop needed
        

        System.out.print("Enter the target: ");
        int target = in.nextInt();
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            // int element = arr[i];
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
