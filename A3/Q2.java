import java.util.Scanner;

public class Q2 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        String s = input.nextLine();
        input.close();
        char x;
        int y;
        String a[]=s.split(" ");
        System.out.println("Words count is "+a.length);
        for(int i=0;i<s.length();i++){
            x=s.charAt(i);
            y=x;
            System.out.println("'"+x+"' "+y);
        }
    }
}
