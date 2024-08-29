package com.company;
import java.util.Scanner;
public class Exercise_1 {
    public static void main(String[]args){
        System.out.println("Write a program to calculate percentage of a give student in 10th. His marks from 6 subject must be taken as input from the keyboard(marks are out of 100) ");
        Scanner sc=new Scanner(System.in);
        System.out.print("Subject 1 marks:");
        int num1=sc.nextByte();
        System.out.print("Subject 2 marks:");
        int num2=sc.nextByte();
        System.out.print("Subject 3 marks:");
        int num3=sc.nextByte();
        System.out.print("Subject 4 marks:");
        int num4=sc.nextByte();
        System.out.print("Subject 5 marks:");
        int num5=sc.nextByte();
        System.out.print("Subject 6 marks:");
        int num6=sc.nextByte();
        float sum=((num1+num2+num3+num4+num5+num6)/600.0f*100);
        System.out.print("percentage of 10th is:");
        System.out.println(sum);
    }
}
