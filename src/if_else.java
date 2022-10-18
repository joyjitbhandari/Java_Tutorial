public class if_else {
    // there are 4 types of if conditions : 1. if condition, 2. if-else condition, 3. else-if condition, 4. Nested if condition.

    /*if Condition: Whenever we want to check for logical conditions we go for if condition.
    *If condition syntax: if{ statements; } */

    /*if-else: if condition is used for checking any condition, if the condition satisfy then the if block will get execute,
    * or else Else block will get execute.
    * Syntax: if(condition){
    *               Statements;
    *            }else{
    *               Statements;
    *            }*/

    /*else-if: When ever we want to provide more than one condition, in that only one condition will get execute then we go for else-if condition.
    * Syntax: if(condition){
    *               Statements;
    *            }else if(condition){
    *               Statements;
    *            }else if(condition){
    *               Statements;
    *            }else{
    *               Statements;
    *            }*/

    /*Nested if-else: Inside an if condition is one more if condition is called nested if-else condition.
    * Syntax: if(condition){
    *             Statements;
    *             if(condition){
    *                Statements;
    *             }else{Statements;}
    *          }else{
    *               Statements;} */

    public static void main(String[] args) {
        //if condition
        if(6>3){
            System.out.println("6 is greater");
        }

        //if else condition
        if(10>15){
            System.out.println("the condition is true");
        }else{
            System.out.println("the condition is false");
        }

        //else if condition
        if(1>15){
            System.out.println("if condition is true");
        }else if(10>5){
            System.out.println("else if condition is true");
        }else {
            System.out.println("else block print");
        }

        // Nested if-else condition
        if(5>3){
            if(5>2){
                System.out.println("5 is greater than both 3 and 2");
            }
        }else{
            System.out.println("conditions are false");
        }

    }
}
