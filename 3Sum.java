
/*Input: arr[] = {0, -1, 2, -3, 1}
*Output: (0 -1 1), (2 -3 1)
*Explanation: The triplets with zero sum are 0 + -1 + 1 = 0 and 2 + -3 + 1 = 0

*Input: arr[] = {1, -2, 1, 0, 5}
*Output: 1 -2 1



*Explanation: The triplets with zero sum is 1 + -2 + 1 = 0
*/
class num {
    static void findTriplets(int[] arr, int n)
    {

        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " "
                                           + arr[j] + " "
                                           + arr[k]);
                        found = true;
                    }
                }
            }
        }
        if (found == false)
            System.out.println("  not exist  ");
    }

    public static void main(String[] args)
    {
        int arr[] = { 0, -1, 2, -9, 1 };
        int n = arr.length;
        findTriplets(arr, n);
    }
}
