/* SYNTAX FOR METHOD
SYNTAX:
    RETURN_TYPE METHOD_NAME(PARAMETER){
        BODY
        RETURN STATEMENT;
   } */

// FOR EAXMPLE:

import java.util.Scanner;
public class Functions_Methods {    // pass by value of number when you calling the method in main().
    static void add(int a , int b){// here, the possible error will occurred(non-static method add(a,b)).
        int c;                    //so, we add static method.
        c = a + b;
        System.out.println("ans: "+ c);
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//RETURN THE VALUE:

    public static int returnadd(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans = num1 + num2;
        return ans;//THE VALUE WILL BE RETURNED HERE.
                   //no more things nothing will happen after the return. it means the prigram will end.
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 //Return String
    public static String returnadd2(){
        String str = " Hello ";
        return str;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*type of mathods:
    1.pre-defined (Build-in) methods:
        -->Methods already provided by Java libraries.*/
// for example:
    public static void predefined(){

        int a = 10 ;
    int b = 29;
    int max = Math.max(a,b);// here, Math.max() is a pre-defined (build in) method.
    System.out.println("maximum num is: " + max);

    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 2.User-defined Method;
       --> method created by user/programmer */

//FOR example: privious programs.---->returnadd2,return add....etc.

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/* Classification Based on Parameters and Return Type
3. Method with No Parameters and No Return Value */

//for example:
    //predefined program. it not have a prameter and return type.

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*4.method with parameters and no return value
for examole:
    public static void parameter(int a,int b){
        System.out.println(a+b);
    } */

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/* 5.method with parameters and return value
for exaple;
    public static String par_ret(String msg){
        msg = "hello ayonokojo":
        return msg;
    } */

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/* 6.Methos with no parameter no return value.
for Example:
    public stsatic void !par_ret!(){
        System.put.println(10 + 20)    
    } */
    public static void greet(String name) {
        String msg = "how are you " + name ;
        System.out.println(msg);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void swap(){
        int a = 10;
        int b = 20;
        System.out.println(a+" "+b);
        int temp = a ;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
////                                                                                                                         

    public static void changestr(String name){// 3.the inialized name will be passed he(currently name = "sung_gin_woo")
        name = "ayonokoji";//4. name = " sung_gin_woo"
    }

////                                                                                                                        
    //in a main method the string is initialized as "name" but, it is declared as "peru" in method calls.
    /* HOW IT'S WORK INTENARLLY
        --> String name = "sung_gin_woo";
        -> *strings are immutable. ////here, "sung_gin_woo" is an object. it stored in "heap memory".
            System.out.println(name);   
            passname(name);////when the name is passed in the method the "value is passed"
                           ////(value of the refference variable is passed)
                           //// IT'S KNOW AS "PASS BY REFERENCE".
        //IMPORTENR NOTE: IN JAVA THERE ARE NO PASS BY REFERENCE ITS ONLY PASS BY VALUE;
        --> void passname(String peru) {// HERE, you are not changing the object you are created one.
                                        //"IT IS A ANOTHER REFERENCE VATIABLE." and new object is created.
                                        ////HERE, actually the "PERU" is copy of the "NAME".
                                        ////it is pass the reference(copy of the objrct value) 
                                        ////AND it is going= to the poit to the same object.
                                        //verdict:
                                        // both of the reference variable pointing to the same object.
                System.out.println(peru);*/    

    public static void passname(String peru) {
        // tis peru contain the value "sun_sin_woo"
        //this peru is only used in this block. 
        //you are not use peru outside the block.
        //IT'S KNOWN AS SCAOPPING.
        System.out.println(peru);
    }

////                                                                                                                                              

//change value

    public static void change_Value (int [] arr){
        arr[4] = 10;
        System.out.println(arr);
    }

public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        // System.out.print("enter two numbers a & b: ");
        // int a = in.nextInt();
        // int b = in.nextInt();
        //add(a,b);
        //int result = returnadd();
        // String result = returnadd2();
        // System.out.println("ans: " + result);
        //predefined();//pre-defined(build-in) method.
        //greet("ayonokoji");
        //swap();
        /*   String name = "sung_gin_woo";// 1.initially name is equal to "sung_gin_woo".
        //changestr(name);// 2.that the initialized name will passed here.
        System.out.println(name);// 5.name will be print "sung_gin_woo"
        passname(name); */
        int [] arr = {12,07,45,6,5,23};
        change_Value(arr);
        System.out.println(arr);


    }
}

