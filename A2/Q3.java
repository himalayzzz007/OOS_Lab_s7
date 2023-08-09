import java.util.Scanner;

public class Q3 {
    static void sumofN(int n){
        n=(n*(n+1))/2;
        System.out.println(n);
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        sumofN(n);
    }
}
