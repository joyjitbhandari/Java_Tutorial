import java.util.Arrays;
public class Array {
    /* Arrays : Arrays is a liner datastructures which is stores homogeneous types of data. Means it can store only one type of data at once;
     * it is non-primitive datatype
     * Arrays are defined as (ArrayType[] arrayName = {})
     * Array is two type 1. Single Dimensional array, 2. Double dimensional array.
     * */
    public static void main(String[] args) {

        // 1. Single Dimensional Arrays
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 65;
        marks[2] = 70;

        int[] marks2 = {85, 90, 60, 75, 50};

        System.out.println(marks[0] + "\n");
        System.out.println(marks[1] + "\n");

        //array properties:
        //length : to find array length.
        System.out.println(marks.length + "\n");

        //sort() : For sorting like assign as ascending or descending order.
        System.out.println(marks2[0] + "\n");
        Arrays.sort(marks2);
        System.out.println(marks2[0] + "\n");


        // 2. Dimensional Array: syntax = (int[][] arrayName = {{},{}})
        int[][] finalMarks = {{97, 95, 85}, {98, 45, 75}};
        System.out.println(finalMarks[0][1] + "\n");
    }
}
