public class Typeconvcast {
    public static void main(String [] args){
        //int num = 34;
        float num = 65;/*here the float value is declared as a integer.
        but the output would be like this = 64 converted into 64.0.
        why? because, the JVM consider the larger values(integer < float & double > float...etc.).
        it's happend during the compile time and automatically.
        therefore it is refered as a type conversion.*/
        System.out.println(num);
        int num1 = (int)(34.89f);/*here the float value has been converted into integer value by using type casting.
        this process happend manually.
        output will print like 34.89 into 34.
        it is also called as "****narrowing conversion****"*/
        System.out.println("ans"+num1); 
    }
    
}
