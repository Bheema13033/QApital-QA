package Javapakage;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int m,sum = 0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number n");
        int n=sc.nextInt();
        while (n>0){
             m = n % 10;
             sum=sum+m;
             n=n/10;
            System.out.println(sum);




        }

    }
}
