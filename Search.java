import java.util.*;

class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            a[i] = sc.nextInt();
        }

        // Input the target element
        System.out.print("Enter the element to search: ");
        int t = sc.nextInt();

        // Linear Search
        int l = -1; // Index of the target element
        for (int i = 0; i < n; i++) {
            if (a[i] == t) {
                l = i;
                break; // Stop at the first occurrence
            }
        }

        System.out.println("Linear Search:");
        if (l == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at index " + l);

        // Sort the array for Binary Search
        

        // Binary Search
        int b = -1;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoid overflow
            if (a[mid] == t) {
                b = mid;
                break; // Stop as soon as we find the target
            } else if (a[mid] < t) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        System.out.println("Binary Search:");
        if (b == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at index " + b);

            
    
    }
}
