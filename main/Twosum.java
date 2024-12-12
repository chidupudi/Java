import java.util.*;
class Twosum
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i =0;i<n;i++)
        {
            System.out.println("Enter each element : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("\f");
         for (int i =0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        int [] twosum=new int[2];
        System.out.println("Enter the target ");
        int target=sc.nextInt();
        for (int i=0;i<n;i++)
        {
             int sum=0;
             twosum[0]=arr[i];
            for (int j=0;j<n;j++)
            {
                sum=arr[i]+arr[j];
                if(sum==target)
                {
                    twosum[1]=arr[j];
                break;
                }
            }
            if(sum==target)
                break;
        }
         for (int i =0;i<2;i++)
        {
            System.out.println(twosum[i]);
        }
    }
}