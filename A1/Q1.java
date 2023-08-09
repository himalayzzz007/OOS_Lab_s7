import java.util.*;

public class Q1 {
    public static void main (String args []){
            Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int exponent = scn.nextInt();
        scn.close();
        int res = 1;
        for (;exponent>0;exponent--){
            res = res * base;
        }
        System.out.println(res);
    }
}
