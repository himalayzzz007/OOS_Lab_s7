import java.util.*;

public class Q3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        input.close();
        int d=0;
        while(x>0){
            x=x/10;
            d++;
        }
        System.out.println("Digits : "+d);
    }
}
