import java.util.*;
public class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,i;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        if(a[i]!=0)
        {
            System.out.printf("%d ",a[i]);
        }
        else
        c++;
        }
        for(i=0;i<c;i++)
        System.out.printf("0 ");
    }
}