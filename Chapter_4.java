package com.company;
import java.util.Scanner; // Importing the Scanner class
public class Chapter_4 {
    public static void main(String[]args){
// Getting user inputs in java
        System.out.println("Taking inputs from user");
        Scanner sc=new Scanner(System.in); // Creating an object named 'sc' of the Scanner class
        System.out.println("Enter first number:");
        int a=sc.nextInt();//(Method to read from the keyboard)
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.print("Sum in:");
        System.out.println(sum);
        System.out.println("---------------------------------------------------------------------------------------");

// Write a program to multiply the tree floating values taking from user
         Scanner s=new Scanner(System.in);
        System.out.print("Enter a value:");
        float num1=s.nextFloat();
        System.out.print("Enter a value:");
        float num2=s.nextFloat();
        System.out.print("Enter a value:");
        float num3=s.nextFloat();
        float sum1=num1*num2*num3;
        System.out.println(sum1);
    }
}
