public class Loops {
    /*Loops: Whenever we want to perform any operation repeatedly or again and again n number of times then we use loop.
    * there are 3 types of loop 1.For Loop, 2.While Loop, 3.Do While Loop */

    public static void main(String[] args) {
        /*For Loop : Whenever we have to perform some operation repeatedly N number of times till the condition satisfy then we go for ForLoop.
         * Or Whenever we know starting and ending range.
         *Syntax: for( initialization ; condition; increment/decrement){body}*/
        //Example: Printing 1 to 10 numbers.
        System.out.println("The 1 to 10 numbers are: ");
        for(int i=1; i<=10; i++){
            System.out.print(i+" ");
        }

        /*While Loop : Whenever we have to perform the operation till the condition satisfy then we go for While Loop.
        * Or Whenever we don't know the ranges.
        * Syntax: Initialization;
        *         While(Condition){
        *               statements;
        *               Increment/Decrement
        *         }*/
        //Example: Printing even numbers for first 20 digits;
        int i = 2;
        System.out.println("\nThe first 20 digits Even numbers are");
        while(i<=20){
            System.out.print(i+" ");
            i+=2;
        }

        /*Do-While Loop : Whenever we are performing the operation first then checking the condition then we go for do-while-Loop
        * Syntax: do{
        *           Statements;
        *           Increment/Decrement
        *           } while(condition);*/
        //Example: Print the 1st 10 digits odd numbers;
        int j = 1;
        System.out.println("\nThe first 10 digits odd numbers are: ");
        do {
            System.out.print(j+" ");
            j+=2;
        } while (j<=10);
    }
}
