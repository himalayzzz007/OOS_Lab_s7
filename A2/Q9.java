import java.util.*;
import java.io.*;

public class Q9 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        
        if (str1.equals(str2)) {
            System.out.println("Equivalent");
        } else {
            System.out.println("Not equivalent");
        }
    }
}
