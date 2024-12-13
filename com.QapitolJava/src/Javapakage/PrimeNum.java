package Javapakage;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        for(int i=2;i<=10;i++){
            if (number % i == 0) {
                System.out.println(i+"not a prime");

           }else{
                System.out.println(i+"prime");
            }

        }
    }
    }


