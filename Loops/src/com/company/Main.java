package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of Times: ");
        int n=sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Message :");
        String s=sc.nextLine();
        for(int i=1;i<=n;i++){
            System.out.println(i+". "+ s);
        }
    }
}
