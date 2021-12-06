package com.company;
import java.util.Scanner;

public class Power {
    static int power(int N,int X){
        if (X != 0) {

            // recursive call to power()
            return (N * power(N, X - 1));
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println("enter num");
        Scanner input=new Scanner(System.in);
        int n1= input.nextInt();
        System.out.println("enter num");
        int n2= input.nextInt();
        System.out.println(power(n1,n2));
    }
    }
