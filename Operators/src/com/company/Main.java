package com.company;

public class Main {

    public static void main(String[] args) {
        double FirstVar = 20.00d;
        double SecondVar = 80.00d;
        double ThirdVar = (FirstVar + SecondVar) * 100.00d;
        System.out.println("My Total Values = " + ThirdVar);
        double Remainder = ThirdVar % 40.00d;
        System.out.println("theRemainder = " + Remainder);
        boolean IsNoRemainder = (Remainder == 0) ? true : false;
        System.out.println("IsNoRemainder= " + IsNoRemainder);
        if (Remainder != 0) {
            System.out.println("Got some remainder");

        }


    }
}
