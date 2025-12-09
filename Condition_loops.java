import java.util.Scanner;
public class Condition_loops {
    public static void main(String []args){
        //If_cond();
        Forloop();
        whileloop();
        dowhile();
        max();
    }
    //IF ELSE CONDITION
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //PROGRAM FOR IF CONDITION WITH SYNTAX & EXAMPLE//
    /* syntax for if else condition
        if(CONTION){
       //BODY WHATEVER YOU WANT WRITE  
       } */
 //FOR EXAMPLE:
/*    public static void If_cond(){
        //IF CONDITION 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your salry amount: ");
        int salary = in.nextInt();
        if (salary > 25000){
            salary = salary + 2800;
        }
        else if(salary > 30000){
            salary = salary + 4800;
        }
        else{
            salary += 1000;
        }
        System.out.println("salary status: "+ salary);
        in.close();
    } */
    //FOR LOOP
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void Forloop(){
// PROGRAM FOR FORLOOP WITH SYNTAX AND EXAMPLE //
   //SYNTAX:
         //   for(initialization : condition||end : increament) {
                  //BODY WHATEVER YOU WANT WRITE
               // }    
//FOR EXAMPLE:

    for(int i = 0 ; i <= 9 ; i++){
        System.out.print(i+ " ");//output like this : 0123456789 
    }

    //PRINT NUMBERS FROM 1 TO N
    Scanner in = new Scanner(System.in);
    System.out.print("\nEnter the number: ");
    int num = in.nextInt();
    for(int i= 1 ; i <=num ; i+=2){ /* in this line we have a simple trick, 
                                    here, the initialization part will be '0'and increament 
                                    part will be '2' the outoput should be "ODD" numbers will print.
                                    and, the initialization part will be '1'and increament part 
                                    will be '2' the outoput should be "EVEN" numbers will print as output.*/
        System.out.print(i + " ");
    }
    }

    //WHILE LOOP
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//WHILE LOOP SYNTAX AND EXAMPLE PROGRAM
/*SYNTAX:
        inialization;
        while(CONDITION) {
            //body(whatever you want write here)
            increment || decreament
        }   */
    public static void whileloop(){
        int a = 1; //INITIALIZATION
        System.out.println();
        while(a != 11){ //CONDITION
            System.out.print(a + " ");
            a++; //INCREAMENT || DECREAMENT
        }
        System.out.println();
    }

    //DO WHILE LOOP SYNTAX WITH AN EXAMPLE
    //SYNTAX:
        /*do{
            //BODY
        }
        while(CONDITION){
           //BODY write whatever you want
        }*/

        public static void dowhile(){
            int i = 1;
            do{
                System.out.println("\ndo is execute atleast once. ");
            }
            while(i != 1);/*here that the thing (n != 1) is still false but
                            the 'do' statement will execute atleast once in this program.
                            and then the next possibility is,even the if 'if' condition will 
                            be true, the 'do' part is first execute and then execute while.*/

        //ANOTHER EXAMPLE:   
            // do{
            //     System.out.print(i + " ");
            //     i++;
            // }
            // while(i <= 9);
    }
    public static void max(){
        int a = 12;
        int b = 23;
        int c = 25;
        int max = a;
        if(b > max){
            max = b;

        }
        if(c > max){
            max = c;
        }
        System.out.println("maximum number is: " + max);
    }
}
