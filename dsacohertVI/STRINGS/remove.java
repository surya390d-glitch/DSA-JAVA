package STRINGS;

public class remove {
    public static void main(String[] args) {
        //Using inbuild method
        String val = "rithika";
        char replace = 'r';
        String newval = val.replace(String.valueOf(replace), "");
        System.out.println("After removing '" + replace + "' (with inbuild method): " + newval);

        //without inbuild method
        StringBuilder res = new StringBuilder();
        // for (int i = 0; i < val.length(); i++) {
        // if (val.charAt(i) != replace) {
        // res.append(val.charAt(i));
        // }
        //}
        for (char element : val.toCharArray()) {
            if (element != replace) {
                res.append(element);
            }
        }
        System.out.println("After removing '" + replace + "' (without inbuild): " + res.toString());
    }
    
}
