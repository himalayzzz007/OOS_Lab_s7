import java.util.*;
public class Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int array[] = new int[n];
        for(int t=0;t<n;t++){
            array[t]=input.nextInt();
        }
        input.close();

        System.out.println("The length of the original array is: "+n);

        int ci=2;
        for(int c=2;c<n;c++){
            if(array[c]!=array[ci-2]){
                array[ci]=array[c];
                ci++;
            }
        }

        System.out.println("After removing duplicates, the new length of the array is: "+ci);
    }
}
