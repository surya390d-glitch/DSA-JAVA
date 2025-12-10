import java.util.Scanner;
public class Condition_loops {
    public static void main(String []args){
        //If_cond();
        //Forloop();
        whileloop();
        dowhile();
        Max();
        charprogram();
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
//   public static void Forloop(){
// PROGRAM FOR FORLOOP WITH SYNTAX AND EXAMPLE //
   //SYNTAX:
         //   for(initialization : condition||end : increament) {
                  //BODY WHATEVER YOU WANT WRITE
               // }    
//FOR EXAMPLE:

/*     for(int i = 0 ; i <= 9 ; i++){
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
                                    will be '2' the outoput should be "EVEN" numbers will print as output.
        System.out.print(i + " ");
    }
    }*/

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
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //DO WHILE LOOP SYNTAX WITH AN EXAMPLE
    //SYNTAX:
        /*do{
            //BODY
        }
        while(CONDITION){
           //BODY write whatever you want
        }*/

//DO WHILE EXAMPLE WITH SYNTAX:
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

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//EXAMPLE PROGRAM 1:  FIND MAXIUM NUMBER.  
    public static void Max(){
        int a = 912;
        int b = 2453;
        int c = 245;
        //int max = 0;
// METHOD NO ONE:

    /*     if(b > max){
            max = b;

        }
        if(c > max){
            max = c;
        }yste
        System.out.println("maximum number is: " + max); */

//METHOD NO 2:
        int max = Math.max(c,Math.max(a,b));
        System.out.println("maximum number is: " + max);       
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//EXAMPLE PROGRAM 2: CHARACTER PROGRAM "CHAR".
    public static void charprogram(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your char: ");
        char ch = in.next().trim().charAt(0);// in this line "trim()" derminate the extra space/line in the output.
                                                    //And "charAt(0)" is defined the index of the String.
        //System.out.println(ch);// the output will be execute without extra space. 
                               // output like this input:  hello -----> output:h.       
                               // it removes extra spaces and print single cahr only.
                                
//NEXT ONE PROGRAM: FIND THE CHARACTER IS UPPERCASE OR LOWERCASE.
            // if(ch >= 'a' && ch <= 'z' ){
            if(ch >= 97 && ch <= 122 ){ // It's worked according to the 'ASCII' Value. (a(97)-z(122)) and (A(65)-Z(90)).
                System.out.println("lower case.");// 97 means 'a' and 122 means 'z'
            }
            else {
                System.out.println("Upper Case.");
            }
//another one:
        // System.out.print("Enter your String: ");
        // String str = in.nextLine();
        // System.out.println(str.charAt(2));// here, i'm print the input of index number 1.               
                                                // ex: input: "hello" ------> output: 'e'.

    }



}
