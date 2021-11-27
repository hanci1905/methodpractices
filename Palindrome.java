package com.company;

import java.util.Scanner;

public class Palindrome {
    static boolean ispalindrome(int num) {
        int temp = num, reversenumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reversenumber = (reversenumber * 10) + lastNumber;
            temp /= 10;
        }
        if (reversenumber == num)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
    System.out.println(ispalindrome(888));

    }


}