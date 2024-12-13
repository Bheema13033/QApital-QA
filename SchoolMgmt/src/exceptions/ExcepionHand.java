package exceptions;

import java.util.Scanner;

public class ExcepionHand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1");
        int number1 = sc.nextInt();
        System.out.println("enter number2");
        int number2 = sc.nextInt();

        try {
            int result = 0;
            result = number1 / number2;

        } catch (Exception e) {
            System.out.println("enter correct number");
        }


    }
}
