package Javapakage;

public class EvenNum {
    public static void main(String[] args) {

        for(int i=0;i<=20;i++){
            if(i%2==0){
                continue;
               }
            if(i>20)
            {
                break;
            }
            System.out.println(i);


        }
    }
}
