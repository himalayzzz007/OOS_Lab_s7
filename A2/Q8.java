import java.util.*;
import java.io.*;

public class Q8 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String reversed = reverseString(s);
        
        System.out.println(reversed);
    }
    
    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            left++;
            right--;
        }
        
        return new String(chars);
    }
}
