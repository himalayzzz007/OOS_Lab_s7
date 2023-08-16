import java.util.*;

public class Q3{
    public static int findMaxLengthPalindromeSubstring(String str) {
        int length = str.length();
        boolean[][] dp = new boolean[length][length];
        int maxLength = 1; 

        for (int i = 0; i < length; i++) {
            dp[i][i] = true;
        }
        for (int i = 0; i < length - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                dp[i][i + 1] = true;
                maxLength = 2;
            }
        }
        for (int len = 3; len <= length; len++) {
            for (int i = 0; i < length - len + 1; i++) {
                int j = i + len - 1; 

                if (str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    maxLength = Math.max(maxLength, len);
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String userInput = inputScanner.nextLine();
        int maxPalindromeLength = findMaxLengthPalindromeSubstring(userInput);

        System.out.println("Maximum length:" + maxPalindromeLength);
        inputScanner.close();
    }
}
