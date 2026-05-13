public class evendig_ex {
    public static void main(String[] args) {
        int[] arr = { 1, 23, 45, 678, 9875, 5 };
        int ans = even_dig(arr);
        System.out.println(ans);
    }

    static int even_dig(int[] num){
        if (num.length < 0) {
            return Integer.MIN_VALUE;
        }
        int count = 0;
        for (int elem : num) {
            if (check_even(elem)) {
                count++;
            }
        }
        return count;
    }
    
    static boolean check_even(int elem) {
        int numofdig = digits(elem);
        return numofdig % 2 == 0;
    }
    
    static int digits(int elem) {
        if (elem < 0) {
            elem = elem * -1;
        }
        int count = 0;
        while (elem > 0) {
            elem = elem / 10;
            count++;
        }
        return count;
    }
}
