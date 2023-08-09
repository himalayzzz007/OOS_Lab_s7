import java.util.Scanner;

public class Q6 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        
        int largest=Integer.MIN_VALUE;
        int sec_largest=Integer.MIN_VALUE;
        
        for(int x : array){
            if(x>largest){
                sec_largest=largest;
                largest=x;
            }
            else if (x>sec_largest && x!=largest){
                sec_largest=x;
            } 
        }
        System.out.println(sec_largest);
    }
}
