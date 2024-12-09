public class MinMaxArray {

    // Method to find the minimum and maximum values in an array
    public static int[] findMinMax(int[] array) {
        // Initialize min and max with the first element of the array
        int min = array[0];
        int max = array[0];
        // Iterate through the array to find min and max
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array [i];
            }
            if (array[i] > max) {
                max = array[i];
            }
            

            
        }
        return new int[]{min, max};
    }
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        
        int[] minMax = findMinMax(array);
        System.out.println("Minimum value: " + minMax[0]);
        System.out.println("Maximum value: " + minMax[1]);
    }
}
