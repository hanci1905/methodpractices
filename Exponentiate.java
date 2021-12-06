package com.company;
import java.util.Scanner;
public class Exponentiate {
    static int exponentiate(int a,int b){
        if (b != 0) {

            // recursive call to power()
            return (a * exponentiate(a, b - 1));
        }
        else {
            return 1;
        }
    }
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Taban değeri giriniz");
        int a=input.nextInt();
        System.out.println("us değeri giriniz");
        int b=input.nextInt();
        System.out.println(exponentiate(a,b));

    }
}
