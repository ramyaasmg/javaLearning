package com.company;

public class Chapter_5 {
    public static void main(String[] args) {
        //Operators in Java
        //An operator is a symbol that the compiler to perform a specific operation on operands.
        //Type of Operators:
// Arithmetic Operators:
        int a=5;
        int b=6;
        int add=a+b;//used to add numbers
        int sub=a-b;//used to subtraction
        int mul=a*b;//used to multiplication
        int div=a/b;//used to division
        int mod=a%b;//used to give the reminder

        System.out.println("addition of a and b is: "+add);
        System.out.println("subtraction of a and b is: "+sub);
        System.out.println("multiplication of a and b is: "+mul);
        System.out.println("division of a and b is: "+div);
        System.out.println("reminder of a and b is: "+mod);
        System.out.println("");

        System.out.println("Comparison Operator:");
        System.out.println(a==b);//to check a and b are equal
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a!=b);
        System.out.println("");

        System.out.println("Logical operators:");
        System.out.println(a<b&&b<a);//this retires true if both operands are true
        System.out.println(a==b||a!=b);//this returns if any operands is true
        System.out.println(!(a<b&&b<a));
        System.out.println("");

        System.out.println("Bitwise Operators");
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);


    }
}
