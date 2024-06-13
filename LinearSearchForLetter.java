public class LinearSearchForLetter {
    public static void main(String[] args) {
        String mainString = "example";
        char searchLetter = 'm';

        int result = linearSearchForLetter(mainString, searchLetter);

        if (result == -1) {
            System.out.println("Letter not found.");
        } else {
            System.out.println("Letter found at index: " + result);
        }
    }

    public static int linearSearchForLetter(String mainString, char searchLetter) {
        int mainLength = mainString.length();

        // Iterate through the main string
        for (int i = 0; i < mainLength; i++) {
            // Check if the current character matches the search letter
            if (mainString.charAt(i) == searchLetter) {
                return i; // Letter found at index i
            }
        }
        return -1; // Letter not found
    }
}
