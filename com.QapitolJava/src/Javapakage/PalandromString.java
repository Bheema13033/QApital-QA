package Javapakage;

public class PalandromString {
    public static void main(String[] args) {
        String s1="";
        String s2="";
        int Length=s1.length();
        for(int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        if(s1.toLowerCase().equals(s1.toLowerCase())){
            System.out.println("its palandrome string");
        }else
        {
            System.out.println("not a palalndrome string");
        }
       // System.out.println(s2);

    }
}
