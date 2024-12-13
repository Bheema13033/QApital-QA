package Javapakage;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Eligible for vote");
            }
            else if (age<18){
                System.out.println("not eligible to vote");
            }
            else{
                System.out.println("invalid");
        }
        }
    }

