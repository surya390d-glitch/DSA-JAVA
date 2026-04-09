import java.util.Arrays;
import java.util.Scanner;

class Array {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 4, 5, 6, 7, 8, 9 }; // or int[]arr = new int[size]; 
        System.out.println(Arrays.toString(arr));
        // arrayfor(arr1);
        // int ans = arrayfor(arr1);
        // System.out.print(Arrays.toString(ans));
        // String[] str = new String[5];
        // arrayObj(str);
        Arr2D();
    }
    //-----------------------------[18/02/2006] -----------------------------------------------------------------------------------
    //-----------------------------(ARRAY OF PRIMITIVES)--------------------------------------------------------------------------

    public static void arrayfor(int arr1[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
            arr1[2] = 234795;//mutablity(cahnged the original object).
        }
        System.out.print(Arrays.toString(arr1));

        // for (int i = 0; i < arr1.length; i++) {
        //     System.out.print(arr1[i] + " ");
        // }

        //Enhanced for loop
        // for (int num : arr1) { //for every element int the array, print the element.
        // System.out.print(num+" "); //here num represnt every element of the Array.
        //}
    }

    //------------------------------(ARRAY OF OBJECTS)------------------------------------------------------------------------------
    public static void arrayObj(String str[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.print(Arrays.toString(str));
        str[2] = "elon"; //orignal String object is changed.
        System.out.print(Arrays.toString(str));
    }
    //-------------------------------(2D ARRAYS)---------------------------------------------------------------------------------
    /* Strings are immutable in java.------------>>>mutable is nothing but, it means you can change the object.
       arrays are mutable in java.            */

    public static void Arr2D() {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][]; //--------------->first listbox denoted "row" & second one denoted column(it's size doesn,t mantatory to assign)
        System.out.print(arr.length);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
            // System.out.println(arr[row][col]+" ");
        }
        for (int row = 0; row < arr.length; row++) {
            System.out.println(arr[row]+" ");
        }
    }
}
