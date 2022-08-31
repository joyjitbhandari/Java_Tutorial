public class Variables {
    public static void main(String[] args){
        // storing a value in variables
        String name = "Joy";
        String friend = "Shanavaj";
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
        * ( String )
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

    }
}

