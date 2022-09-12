package org.example;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = sc.nextInt();
        System.out.println("===========================");
        System.out.println("Enter Number are  " + num);
        System.out.println("===========================");
        int reverse = 0;
        while (num > 0) {
            int rem = num % 10;
            reverse = (reverse *10) + rem;
            num = num / 10;
        }
        System.out.println(" Number After are  " + reverse);
        System.out.println("===========================");
    }
}


