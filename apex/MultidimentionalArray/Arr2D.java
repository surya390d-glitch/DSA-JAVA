package MultidimentionalArray;

import java.util.Scanner;
public class Arr2D {
    public static void main(String[] args) {
        int[][] arr2D = new int[2][3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i >= arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print("Enter your Input: ");
                arr2D[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i >= arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.println(arr2D[i][j] + " ");
            }
            System.out.println();
        }

    }
}
