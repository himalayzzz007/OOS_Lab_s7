import java.util.*;

public class Q4 {
    public static void main (String args []){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        scn.close();
        int b=0;

        while(a>0){
            int c=a%10;
            b=b*10+c;
            a=a/10;
        }

        System.out.println(b);
    }
}