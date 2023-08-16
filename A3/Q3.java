import java.util.*;

public class Q3{
    public static String removeDuplicates(String input) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);        
    }
}
