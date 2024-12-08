import java.util.*;
class linear
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n=sc.nextInt();
        System.out.print("Enter the elements ");
        int [] arr=new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.print((i+1)+" Element : ");
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        System.out.print(arr[i]+" ");

        System.out.println("Enter the element to search");
        
    }
}