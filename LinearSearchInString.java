public class LinearSearchInString {
    public static void main(String[] args) {
        String mainString = "Hello, this is a simple string search example.";
        String searchString = "simple";

        int result = linearSearch(mainString, searchString);

        if (result == -1) {
            System.out.println("Substring not found.");
        } else {
            System.out.println("Substring found at index: " + result);
        }
    }
    public static int linearSearch(String mainString, String searchString) {
        int mainLength = mainString.length();
        int searchLength = searchString.length();

        // Iterate through the main string
        for (int i = 0; i <= mainLength - searchLength; i++) {
            // Check if the substring matches
            int j;
            for (j = 0; j < searchLength; j++) {
                if (mainString.charAt(i + j) != searchString.charAt(j)) {
                    break;
                }
            }
            if (j == searchLength) {
                return i; // Substring found at index i
            }
        }
        return -1; // Substring not found
    }
}
