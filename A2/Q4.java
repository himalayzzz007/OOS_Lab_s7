package assg2;

import java.util.Scanner;

public class Q4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        int k = input.nextInt();
        input.close();

        int x=-1;
        for(int j=0; j<n; j++){
            if(array[j]==k){
                x=j;
                break;
            }
        }

        System.out.println(x);
    }
}
