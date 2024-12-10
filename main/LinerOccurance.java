import java.util.*;
class LinerOccurance
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the elements : ");
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the key value : ");
        int k=sc.nextInt();
        
        
        int c=0;
        for (int i=0;i<n;i++)
        if (a[i]==k)
        c=c+1;
        System.out.println(c);
    }
    
}