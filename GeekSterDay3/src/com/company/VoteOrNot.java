package com.company;

import java.util.Scanner;

public class VoteOrNot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age;
        System.out.println("Enter Age of Person : ");
        age=input.nextInt();
        System.out.println("The result is "+(age>=18));
        System.out.println("Answer key: \nTrue :-Eligible to Vote \nFalse :-Not Eligible to Vote");



    }
}

