import java.util.Scanner;

public class Q1 {
    static void palindrome(int x){
        int a=0;
        int b=x;
        while(b>0){
            int c = b%10;
            a=a*10+c;
            b=b/10;
        }

        if(a==x){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        palindrome(n);
    }
}
