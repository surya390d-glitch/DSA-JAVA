public class EvenDigitsQ {
    public static void main(String[] args) {
        int[] arr = { 12, 345, 22, 6, 7896 };
        int ans = evenDigits(arr);
        System.out.println(ans);
        System.out.println(Digits2(-234558779));
    }

    static int evenDigits(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int count = 0;
        for (int elements : arr) {
            if (Even(elements)) {
                count++;
            }
        }
        return count;
    }

    static boolean Even(int elements) {
        int digitofNums = Digits(elements);
        return digitofNums % 2 == 0;
    }

    static int Digits(int elements) {
        if (elements < 0) {
            elements = elements * -1;
        }
        int count = 0;
        while (elements > 0) {
            count++;
            elements /= 10;
        }
        return count;
    }

    static int Digits2(int elements) {
        if (elements < 0) {
            elements = elements * -1;
        }
        return (int) (Math.log10(elements)) + 1;
    }
}
