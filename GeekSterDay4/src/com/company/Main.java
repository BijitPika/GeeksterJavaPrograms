package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int n1, n2, n3;
        n1 = in.nextInt();
        n3 = in.nextInt();
        n2 = in.nextInt();
        if (n1 > n2&&n1>n3){
            System.out.println(n1);
        }else if(n2>n1&&n2>n3){
            System.out.println(n2);
        }else if(n3>n1&&n3>n2){
            System.out.println(n3);
        }else if(n1==n2&&n2==n3){
            System.out.println("All numbers are same");
        }else {
            System.out.println("Two numbers are same");
        }

}
}

