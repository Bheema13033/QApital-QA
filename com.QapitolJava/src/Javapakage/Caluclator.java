package Javapakage;

import java.util.Scanner;

public class Caluclator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        while (true){
            System.out.println("Calculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();
            if (choice == 5) {
                System.out.println("Exiting the calculator...");
                break;


        }
            double num1, num2;

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = sc.nextDouble();
            } else {
                System.out.println("Invalid choice, please try again.");
                continue;
            }
            double result = 0;
            boolean validOperation = true;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero.");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select between 1 and 5.");
                    validOperation = false;
            }
            if (validOperation) {
                System.out.println("Result: " + result);
            }
        }

        sc.close();
    }
}


