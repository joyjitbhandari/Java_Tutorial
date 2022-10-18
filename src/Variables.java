public class Variables {
    // Variables/ DataMembers: It is named memory space which can store data or values;
    // Variables are 2 types - 1. Primitive type , 2. NonPrimitive type
    // Variables are classified as 1. Local variable , 2. Global Variable.

    /* Local Variable = Any variable which is declared  with in the method is called local variable.
    * --> Scope of local variable is start from beginning of the method till end of the method.
    * --> We can not declare local variable as static and nonstatic.
    * --> local variable should be initialized before utilize.
    * --> It will not have any default values. */

    /* Global Variable = Any variable which is declared outside the method inside the class is called global variable.
    * --> Scope of global variable is from beginning of the class till end of the class.
    * --> It can be classified as static as well as nonstatic.
    * --> It has default values.
    * (byte = 0, short =0, int = 0, long =0, float =0.0f, double = 0.0d, boolean = false, char = '/U000', String = null) */
    static int x =10;// global variable.
    public static void main(String[] args){
        // storing a value in variables
        System.out.println(x);//utilize of global variable.
        String name = "Joy";// local variable.
        String friend = "Shanavaz";
        String fname = friend;
        int age = 30;
        // printing the variables
        System.out.println(name);
        System.out.println(friend);
        System.out.println(fname);
        System.out.println(age);

        /*Java Types
        * Here is two types of variables
        * 1. primitive Types = Normal/ Simple values are store here.
        *(byte - 1 [-128 to 127],
        * short - 2 byte,
        * int - 4 byte,
        * long - 4 byte,
        * float - 4 byte,
        * Double - 8 byte,
        * char - 2 byte,
        * boolean - 1 byte true/ False)

        * 2. Non-Primitive Types / Reference = Complex type values are store here.
        * ( String , Array , Class type)
        * */

        //Example: Primitive Type
        byte Age = 30;
        int phone = 1234567890;
        long phone2 = 12345678900000L;
        float pi = 3.14F;
        char letter = '@';
        boolean isAdult = true;
        short age2 = 12345;
        double marks = 60.61;

        // Example: Non-Primitive Type
        String Name = "Lakshmi";
        System.out.println(Name.length());
        
         // Constant Variable : It is variable which value we cant change latter. Means the value of variable is immutable.
        // To make a variable constant we make use of 'final' keyword.
        // Example:
        final float PI = 3.14F;
        // PI = 3.4; this will get an error because here we want to change constant variable value.

    }
}

