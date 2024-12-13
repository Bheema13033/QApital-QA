package Javapakage;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        System.out.println("Enter Length");
        System.out.println("enter Width");
        Scanner sc=new Scanner(System.in);
        int Length = sc.nextInt();
        int Width= sc.nextInt();
        int R=Length*Width;
        System.out.println("Area of Recatngle,"+R);

    }
}
