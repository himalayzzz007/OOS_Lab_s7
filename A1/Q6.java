import java.util.*;

public class Q6 {
    public static void main (String args []){
        Scanner scn = new Scanner(System.in);
        int c = scn.nextInt();
        scn.close();
        int b=0;
        int a=c;
        while(a>0){
            int d=a%10;
            b=b*10+d;
            a=a/10;
        }

        if(b==c){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}