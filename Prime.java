package com.company;

import java.util.Scanner;

public class Prime {
    static boolean isPrime(int n,int i) {
        // Base cases
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        // Check for next divisor
        return isPrime(n, i + 1);

    }

    public static void main(String[] args) {
    System.out.println("enter num");
    Scanner input=new Scanner(System.in);
    int n= input.nextInt();

        if (isPrime(n, 2))
            System.out.println(n + " sayisi asaldir");
        else
            System.out.println(n + " sayisi asal degildir");

    }
}
