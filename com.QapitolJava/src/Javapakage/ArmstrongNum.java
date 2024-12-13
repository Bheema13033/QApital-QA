package Javapakage;

public class ArmstrongNum {
    public static void main(String[] args) {
        int i, sum = 0, temp, n = 371, r;
        temp = n;

            while (n > 0) {
                r = n % 10;
                sum = sum + (r * r * r);
                n = n / 10;
            }
            if (temp == sum) {
                System.out.println("its armstrong number");
            } else {
                System.out.println("not armstrong number");
            }

        }
    }
