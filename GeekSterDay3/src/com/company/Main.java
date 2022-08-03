package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age;
        age=input.nextInt();
        if(age>=18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not eligible");
        }




    }
}
