/* SYNTAX FOR METHOD
SYNTAX:
    RETURN_TYPE METHOD_NAME(PARAMETER){
        BODY
        RETURN STATEMENT;
   } */

// FOR EAXMPLE:

import java.util.Scanner;
public class Functions_Methods {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter two numbers a & b: ");
        int a = in.nextInt();
        int b = in.nextInt();
        add(a,b);
    }
    
    static void add(int a , int b){// here, the possible error will occurred(non-static method add(a,b)).
        int c;                    //so, we add static method.
        c = a + b;
        System.out.println("ans: "+ c);
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void next(){
        
    }
}
