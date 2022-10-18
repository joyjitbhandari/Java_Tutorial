public class Method_or_Functions {
    // Method : It is a block of statement which will get execute when it is called or invoked;
    // syntax of method is [ Access_Specifier Modifier Return_Type Identifier(Arguments){Body / Definition}]


    // Method without parameter
    static void add(){
        int a = 10, b=50;
        System.out.println("adding:- "+(a+b));
    }

    //Method with Parameters
    static void sub(int a, int b)//here taking a and b as argument
     {
        System.out.println("Subtraction:- "+(a-b));
    }

    // method with return type
    /*When ever we want to return any data from method that time we have to provide the return type in method .
    * the method return type and returning value type should same.*/
    static int mul(){
        int a = 8, b= 5;
        int res = a*b;
        return res;
    }

    public static void main(String[] args) {
        add();//we're calling the method in main method;
        sub(50,19);//Calling the method by passing values in parameter
        int result = mul();
        System.out.println("Multiplication:- "+result);
    }
}
