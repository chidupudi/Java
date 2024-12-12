import java.util.*;
class SelectionSort
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n=sc.nextInt();
        int min=-1;
        System.out.print("Enter the elements ");
        int [] arr=new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.print((i+1)+" Element : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n-1;i++)
        {
            min=i;
            for(int j=i+1;j<n;j++)
            {
                if (arr[min]>arr[j])
                min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        } 
    }
}