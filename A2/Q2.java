import java.util.Scanner;

public class Q2 {
    static int prime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }

    static void primelist(int x, int y){
        for(int i=x+1;i<y;i++){
            if(prime(i)==1){
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();

        primelist(a,b);
    }
}
