import java.util.Scanner;

public class Q5 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int rows1 = input.nextInt();
        int cols1 = input.nextInt();
        int rows2 = input.nextInt();
        int cols2 = input.nextInt();
        
        int m1[][] = new int[rows1][cols1];
        int m2[][] = new int[rows2][cols2];
        if(cols1!=rows2){
            System.out.println("Multiplication not possible!!!");
            return;
        }
        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols1;j++){
                m1[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<rows2;i++){
            for(int j=0;j<cols2;j++){
                m2[i][j]=input.nextInt();
            }
        }
        int m3[][] = new int[rows1][cols2];
        
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        
        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols2;j++){
                System.out.print(m3[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
