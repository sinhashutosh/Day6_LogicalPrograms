package org.example;

import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Fibbonacci Series...");
        int size = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.print(a + "," + b);
        for (int i = 0; i < size - 2; i++) {
            c = a + b;
            System.out.print("," + c);
            a=b;
            b=c;

        }
    }
}
