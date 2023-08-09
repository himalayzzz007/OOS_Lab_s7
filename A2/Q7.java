import java.util.*;
import java.io.*;

public class Q7 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String result = convertToLowercase(s);
        System.out.println(result);
    }

    public static String convertToLowercase(String input) {
        StringBuilder result = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}
