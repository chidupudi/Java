public class substring {
    
}
public class LongestValidSubstring {
    public static void main(String[] args) {
        String input = "abc!def12*ghi@jkl";
        String result = findLongestValidSubstring(input);
        System.out.println("Longest substring without special characters: " + result);
    }

    public static String findLongestValidSubstring(String str) {
        int maxLength = 0;
        int start = 0;
        int currentStart = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                // Calculate the length of the current valid substring
                int currentLength = i - currentStart + 1;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = currentStart;
                }
            } else {
                
                currentStart = i + 1;
            }
        }

        // Return the longest valid substring
        return str.substring(start, start + maxLength);
    }
}
