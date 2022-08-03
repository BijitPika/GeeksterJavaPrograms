package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=in.nextInt(),i,j;
       for(i=1;i<=n;i++){
           for(j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
