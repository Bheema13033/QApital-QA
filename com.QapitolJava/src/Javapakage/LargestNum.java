package Javapakage;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = sc.nextInt();
        System.out.println("enter num2");
        int num2 = sc.nextInt();

        System.out.println("enter num3");
        int num3 = sc.nextInt();
        int largest = large(num1, num2, num3);
        System.out.println(largest);


    }



    public static int large(int num1, int num2, int num3) {
        if(num1>=num2 && num1>=num3){
            return num1;
        }else if (num2>=num1 && num2>=num3){
            return num2;
        }
        return num3;

    }

}
