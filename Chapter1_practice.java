package com.company;
import java.util.Scanner;
public class Chapter1_practice {
    public static void main(String[] args) {
        //Question 1
        System.out.println("Write a program to calculate CGPA using marks of three subject(out of 100)");
        System.out.println("");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st subject marks: ");
        float a=sc.nextFloat();
        System.out.print("Enter 2nd subject marks: ");
        float b=sc.nextFloat();
        System.out.print("Enter 3rd subject marks: ");
        float c=sc.nextFloat();
        float sum =(a+b+c)/30;
        System.out.println("CGPT is  "+sum);
        System.out.println("---------------------------------------------------------------");

        //Question 2
        System.out.println("Write a program which ask the user to enter his/her name and give greets them with 'hello<name>,have a good day' ");
        System.out.println("");
        System.out.println("What is your name");
        String name = sc.next();
        System.out.println("hello "+name+" have a good day");
        System.out.println("---------------------------------------------------------------");

        //Question 3
        System.out.println("Write a java program to covert kilometer to mils");
        System.out.println("");
        System.out.print("kilometer to mils ");
        float km= sc.nextFloat();
        float mi =(km*0.62137119f);
        System.out.print(mi);
        System.out.println("---------------------------------------------------------------");

        //question 4
        System.out.println("Write a program to detect whether a number entered by user is integer or not");
        System.out.println("");
        System.out.print("Enter a number");
        System.out.println(sc.hasNextInt());

    }
}
