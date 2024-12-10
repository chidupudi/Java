import java.util.*;
class linear1
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
        int f=sc.nextInt();
        int f1=-1;
        for (int i=0;i<n;i++)
            if (arr[i]==f){
                f1=i;  
                if(f1!=-1)
        System.out.println("Element found at "+(f1+1)+ " index ");
                System.exit(0);
            }
        
                System.out.println("Element found at not found ");

    }
}