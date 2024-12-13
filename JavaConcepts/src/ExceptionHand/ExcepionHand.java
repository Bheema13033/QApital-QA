package ExceptionHand;


import java.util.Scanner;

public class ExcepionHand {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("enter number1");
        int number1 = sc.nextInt();
        System.out.println("enter number2");
        int number2 = sc.nextInt();*/


        try {
            int[] arr={1,5,3,4,8,9};
            System.out.println(arr[8]);
        }
        catch (Exception e) {

        System.out.println(e);

        }
        }


    }


