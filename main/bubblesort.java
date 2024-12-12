import java.util.*;
class bubblesort
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
        {
           System.out.print(arr[i] +" "); 
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        for (int i=0;i<n;i++)
        {
           System.out.print(arr[i] +" "); 
        }
    }
}