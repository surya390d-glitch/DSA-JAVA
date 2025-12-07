public class Typeconvcast {
    public static void main(String [] args){
        //int num = 34;


        /* ***TYPE CONVERSION UH*** */
        float num = 65;/*here the float value is declared as a integer.
        but the output would be like this = 64 converted into 64.0.
        why? because, the JVM consider the larger values(integer < float & double > float...etc.).
        it's happend during the compile time and automatically.
        therefore it is refered as a type conversion.*/
        System.out.println(num);


        /* ***TYPE CASTING*** */
        int num1 = (int)(34.89f);/*here the float value has been converted into integer value by using type casting.
        this process happend manually.
        output will print like 34.89 into 34.
        it is also called as "****narrowing conversion****"*/
        System.out.println("ans: "+num1); 

        /* ***AUTOMATIC TYPE PROMOTION IN EXPRESSION*** */
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);

        byte c = 40;
        byte d = 50;
        byte f = 100;
        int e = (c*d)/f;
        /* *** here the c and d is bytes, its using arithmetic operation(40*50=2000). 
        here the question is, byte range is 256 but the arithmetic operation value is
        exceed the byte range. why? because, that the arithmetic value 2000 is
        stored in integer(int range -+2billion)*** */
        System.out.println(e);

        /* ***ASCII VALUE TYPE CASTING*** */
        int g = 'l';
        System.out.println("ACSII: " + g);

        /* ***TYPE PROMOTION RULES*** */
        System.out.println(45 * 34.97464f);//(int * float = float || int * double = double)
        
        int i = 6000;
        float f1 = 34.674592f;
        char ch = 'l';
        double d1 = 23.345678934d;
        short s = 1598;
        byte b1 = 127;
        double result = (f1 * b1) + (i / ch) - (d1 - s);
        System.out.println((f1 * b1) + " | " + (i / ch)+ " | " +(d1 - s));
        System.out.println(result);
    }
    
}
