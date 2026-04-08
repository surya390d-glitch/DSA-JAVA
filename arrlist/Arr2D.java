import java.util.Arrays;
import java.util.Scanner;

public class Arr2D {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = in.nextInt();
            }
        }

        // for (int r = 0; r < arr.length; r++) {
        //         // System.out.println(Arrays.deepToString(arr[r][c]+" "));
        //         System.out.println(Arrays.toString(arr[r])); 
        // }
        for (int[] nums : arr) {
            System.out.println(Arrays.toString(nums));
        }

        in.close();

        DiffsizeArr obj = new DiffsizeArr();
        obj.code();
    }
}

class DiffsizeArr {
    void code(){
        int [][] arr = {{1,2,3,4},
                    {5,6},
            { 7, 8, 9 } };
        for (int r = 0; r < arr.length; r++) {
            // for (int c = 0; c < arr[r].length; c++) {
            //     System.out.print(arr[r][c] + " ");
            // }
            System.out.println(Arrays.toString(arr[r]));
        }
        
    }
}
