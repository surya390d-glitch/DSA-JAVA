class str_rev {
    public static void main(String[] args) {
        char[] ch = "surya".toCharArray();
        int left = 0;
        Method obj = new Method();
        obj.display();
        int right = ch.length - 1;

        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }
        System.out.println(new String(ch));

    }
}

class Method {
    void display() {
        String s = "sir";
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(rev);

        // String str = "interview";
        // String reversed = new StringBuilder(str)
        //         .reverse()
        //         .toString();
        // System.out.println(reversed);

    }
}

