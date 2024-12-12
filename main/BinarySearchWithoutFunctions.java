public class BinarySearchWithoutFunctions {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 3, 5, 7};
        int key = 3;

        int low = 0, high = arr.length - 1;
        int firstOccurrence = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                firstOccurrence = mid;
                high = mid - 1; 
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low = 0;
        high = arr.length - 1;
        int lastOccurrence = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                lastOccurrence = mid;
                low = mid + 1; 
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (firstOccurrence != -1 && lastOccurrence != -1) {
            System.out.println("First Occurrence: " + firstOccurrence);
            System.out.println("Last Occurrence: " + lastOccurrence);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
