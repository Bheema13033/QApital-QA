package Javapakage;

public class PalanedromeNum {
    public static void main(String[] args) {
        int i,sum=0,temp,n=121,r;
        temp=n;
        while(n>0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
            if(temp==sum){
                System.out.println("its palendrome");
            }else {
                System.out.println("not palandrome");
            }

        }


    }

