package Javapakage;

import java.util.Random;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of times flips coin");
        int flips=sc.nextInt();
        Random random=new Random();
        for(int i=1;i<flips;i++){
            int result=random.nextInt(2);
            if(result==0){
                System.out.println(+i +" heads");
            }else{
                System.out.println(+i +" tails");
            }

        }
    }
}
