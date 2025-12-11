import java.util.Scanner;
public class Condition_loops {
    public static void main(String []args){
        //If_cond();
        //Forloop();
        //whileloop();
        //dowhile();
        //Max();
        //charprogram();
        //fibonacci();
        //duplicate();
        //reverse();
        calc();
    }
    //IF ELSE CONDITION
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //PROGRAM FOR IF CONDITION WITH SYNTAX & EXAMPLE//
    /* syntax for if else condition
        if(CONTION){
       //BODY WHATEVER YOU WANT WRITE  
       } */
 //FOR EXAMPLE:
    public static void If_cond(){
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
    } 
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
        }
//another one:
        // System.out.print("Enter your String: ");
        // String str = in.nextLine();
        // System.out.println(str.charAt(2));// here, i'm print the input of index number 1.               
                                                // ex: input: "hello" ------> output: 'e'.*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//PROGRAM FOR FIBONACCI SERIES: FIND THE Nth FIBONACCI NUMBER.
            /* theory of fibonacci series:
            fibonacci series is addition of previous two numbers.
            for example: 0,1,1,2,3,5,8,13,21....ect. -----> 0+1=1,1+1=2,1+2=3,2+3=5....ect.*/
    public static void fibonacci(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter your number: ");
        int num = in.nextInt();
        int previous_num = 0;
        int current_num = 1;
        int count = 2;
        while(count <= num) {//we already know about first two fibo numbers are "0 & 1". so,the will start from 3||2.
            int temp = current_num;//let cosider the temprory value is current num.ex: 1
            current_num = previous_num + current_num;//here, the cuurent value is updated by adding privious + current. ex: 0+1
            previous_num = temp;//in this line the privious num is ubdated as a temprory value.ex : 0 + 1 = 1.
            count ++;// count will updated untill the input num is finding.ex: 5
        }
        System.out.println(num +"th fibonacci number is: "+current_num);//print tha
        System.out.println("count: "+count);// count increase untill the while is false
        in.close();
    } 
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //PROGRAM: find the repeated number in the given input.
    public static void duplicate(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your target number: ");
        int target = in.nextInt();
        int num = 412445144;
        int count = 0;
        while(num > 0){
            int rem = num%10;//GET THE LAST DIGIT IN THIS GIVEN NUMBER. EX: 4 
        if(rem == target){//check the condition. count the number of " 4's ".
            count ++;//count the number 
        }
        num = num/10;//remove the last digit
        }
        System.out.println(target+" is repeated "+count+" times.");//final output: how many "4's" repeat in this number.
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//revrse program: 
    public static void reverse(){
        int num = 1234567;//original numbers(ascending order)
        int ans = 0;
        while(num > 0) {// loop run until num becomes '0'.
            int rem = num % 10;// get last digit or reminder.
            num /= 10;//remove the last digit.
            ans = ans * 10 + rem;//store the last digit in the ans(reverse). 
                                 //EX: initially ans = '0' and reminder is '7'.
                                 //here,0 * 10 + 7 = '7'. (0*10=0 & 0+7=7).
                                 //same,7 * 10 + 6 = '76'.(7*10=70 & 70+6=76)
                                 //repeat the process for each numbers untill while wil be '0' ,
                                 //and we get the output like this "7654321".
        System.out.println(ans);  
        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//CALCULATOR PROJECT: using 'SWITCH' statement.

//in this program was developed by my own creativity stuffs.
    public static void calc(){
        Scanner in = new  Scanner(System.in);
        while(true){ //INFINITE WHILE LOOP.
            System.out.println("Enter your operation: ");
            char op = in.next().trim().charAt(0);
            int ans = 0;
            if(op =='+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("enter the numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                switch(op){
                    case '+':
                    ans = num1 + num2;
                    System.out.println(num1+" "+op+" "+num2+" = "+ans);
                    break;

                    case '-':
                    ans = num1 - num2;
                    System.out.println(num1+" "+op+" "+num2+" = "+ans);
                    break;

                    case '*':
                    if(num1 != 0 && num2 != 0){
                        ans = num1 * num2;
                        System.out.println(num1+" "+op+" "+num2+" = "+ans);
                    }
                    else{
                        System.out.println("0's are not allowed to multiplication.");
                    }
                    break;

                    case '/':
                    ans = num1 / num2;
                    System.out.println(num1+" "+op+" "+num2+" = "+ans);
                    break;

                    case '%':
                    ans = num1 % num2;
                    System.out.println(num1+" "+op+" "+num2+" = "+ans);
                    break;

                    default:
                    System.out.println("invalid operation.");
                }
            }
            else if (op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("this operation doesn't exist. pls,Enter the valid operation.");
            }
            System.out.println("result: " + ans);
        }
    }    
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
