package Javapakage;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        //System.out.println("enter the name");
        //int name=sc.nextInt();
        String s1="I AM TESTER";
        String s2="";
        for(int i = s1.length()-1; i>=0; i--){
             s2+=s1.charAt(i);
            System.out.println(s2);
        }

    }
}
