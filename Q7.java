import java.util.*;

public class Q7 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int f=0;
        for(int i=2;i<n;i++){
            f=a+b;
            a=b;
            System.out.println(f);
            b=f;
        }
    }
}
