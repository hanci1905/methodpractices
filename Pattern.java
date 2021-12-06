package com.company;
import java.util.Scanner;
public class Pattern {
    static void pattern(int n,int flag,boolean a){
        System.out.print(" " + flag);

        if(flag<=0){
            a=false;
        }
        int next=a ? flag-5:flag+5;
        if(next <= n) {

            pattern(n,next,a);}
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("which number do you select?");
        int n= input.nextInt();
        System.out.print("Çıktısı :");

        pattern(n,n,true);
    }
}
