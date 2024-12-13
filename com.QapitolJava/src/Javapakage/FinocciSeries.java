package Javapakage;

public class FinocciSeries {
    public static void main(String[] args) {
        int fib1=0,fib2=1,fib3,n=100;
        System.out.println("fib1"+ "+fib2");
        for(int i=2;i<=n;++i){
            fib3=fib1+fib2;
            System.out.println(fib3);
            fib1=fib2;
            fib2=fib3;

        }

    }
}
