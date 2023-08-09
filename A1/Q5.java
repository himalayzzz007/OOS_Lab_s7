import java.util.*;

public class Q5 {
    public static void main (String args []){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++){
            array[i]=scn.nextInt();
        }
        scn.close();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]<array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        System.out.println("Array in Descending Order:");
        for(int j=0;j<n;j++){
            System.out.println(array[j]);
        }
    }
}