/**
 * Program to create Strings using literals
 */

package stringsdemo;

public class StringCreationDemo1 {

    public static void main(String[] args)
    {
        /*
        Compiler will check for the contents in string pool.
         If it exists new string is not created, It refers to the existing string
         If it doesn't exist a new String is created in String pool (Heap Memory)
         */

        String first="Java";
        String second="Python";
        String third ="Programming";
        String fourth="Java"; //reuse existing Strings in the fool - Memory Efficiency

        System.out.println("The First String is "+first+" - Memory location :"+first.hashCode());
        System.out.println("The Second String is "+second+" - Memory location :"+second.hashCode());
        System.out.println("The Third String is "+third+" - Memory location :"+third.hashCode());
        System.out.println("The Fourth String is "+fourth+" - Memory location :"+fourth.hashCode());

        System.out.println();

        // String Operations

        System.out.println("The length of second String is :" + second.length());
        System.out.println("The join of first and third String is :"+ first.concat(third));
        System.out.println("THe comparison of first and second string is :"+ first.equals(second));
        System.out.println("THe comparison of first and fourth string is :"+ first.equals(fourth));


        //Strings are immutable - Once Created cannot be modified
        String example="Hello";
        System.out.println("The example String is : "+example+"  - Memory location :"+example.hashCode());
        example=example.concat("world"); //original example string remains unchanged
        System.out.println(example); // new reference object created with hello world
        System.out.println("The modified example String is : "+example+"  - Memory location :"+example.hashCode());


    }
}
