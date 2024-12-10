import java.util.Scanner;
class array
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n=sc.nextInt();
        int []a=new int [n];
        System.out.println("Enter the elements ");
        for (int i=0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+" element :");
            a[i]=sc.nextInt();
            System.out.println();
        }
        int i=-1;
        int left=0;
        int right=n-1;
        System.out.println("Enter the target : ");
        int t=sc.nextInt();
        while (left <= right) {
            int mid = left + (right - left) / 2; // Midpoint

            if (a[mid] == t) {
                i = mid; // Target found
                break;  // Exit loop
            } else if (t < a[mid]) {
                right = mid - 1; // Search in left half
            } else {
                left = mid + 1; // Search in right half
            }
        }
        if (i==-1)
        System.out.println("Element not found ");
        else 
        System.out.println("Element found at "+i);
    }
}




