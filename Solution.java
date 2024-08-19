package Java;

class Solution {
    public static int Linear(int[] a, int find) {
        for (int i = 0; i < a.length; i++) {
            int k = a[i];
            if (k == find) {
                return  i;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int ar[] = {43, 33, 865, 4356, 2363, 346};
        int index = Linear(ar, 346);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
