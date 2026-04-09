//----------------------------------------------(non-repeating)----------------------------------------------------------------------------------
    /*1. Find the first non-repeating element
    Input: {2, 3, 4, 2, 3, 5, 4}*/

class Non_repeat{

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 2, 3, 5, 4 };
        check(arr);
    }  
    static void check(int[] arr) {
        for (int i = 0; i < arr.length; i++) {//2 ------> pick the one element
            int count = 0;
            for (int j = 0; j < arr.length; j++) {//2,3,4,2,3,5,4 ------->compares with outer loop
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("ans: " + arr[i]);
            }

        }
        // return false;
    }
}