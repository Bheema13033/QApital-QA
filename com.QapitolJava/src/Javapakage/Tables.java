package Javapakage;

import java.util.Scanner;

public class Tables {
    public void muliple(int number){
        int table=1;
        for(int i=1;i<=10;i++)
        {{
                table=number*i;
            }
            System.out.println(number+"*"+i+"="+table);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        Tables t1=new Tables();
        t1.muliple(number);

    }
}
