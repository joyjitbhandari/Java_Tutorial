import java.util.logging.SocketHandler;

public class Operators {
    /* Operator means - it is a symbol which is used to perform operation on operands.
    * In java different types of operators are there :-
    * 1.Arithmetic operators = (+ , - , *, / )
    * 2.Relational Operators = Comparison(< , > , <= , >=), Equality(== , !=)
    * 3.Logical Operators = (&& , ||)
    * 4.Shift = (>> , << , >>>)
    * 5.Unary = (++ , --)
    * 6.Ternary = (? , :)
    * 7.Assignment = (=,+=,-=,/=,%=,&=,^=,|=,<<=,>>=,>>>=)*/
    public static void main(String[] args){
        System.out.println("Arithmetic Operators");
        System.out.println(10+20);
        System.out.println(20-10);
        System.out.println(10*4);
        System.out.println(40/2);

        System.out.println("Comparison Operators");
        System.out.println(10>20);
        System.out.println(20<30);
        System.out.println(10>=10);
        System.out.println(30>=20);
        System.out.println(10<=20);
        System.out.println(10<=10);

        System.out.println("Equals Operator");
        System.out.println(50==50);
        System.out.println(50!=50);
    }
}
