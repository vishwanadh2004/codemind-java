import java.util.*;
public class Codemind
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,i,j,t,k;
      n=sc.nextInt();
      int[] a=new int[n];
      for(i=0;i<n;i++)
      {
      a[i]=sc.nextInt();
      }
      for(i=0;i<n;i++)
      {
          for(j=i+1;j<n;j++)
          {
              if(a[i]==a[j])
              {
                  for(k=j;k<n-1;k++)
                  {
                      a[k]=a[k+1];
                  }
                  j--;
                  n--;
              }
          }
      }
      for(i=0;i<n;i++)
      {
          for(j=i+1;j<n;j++)
          {
              if(a[i]>a[j])
              {
                  t=a[i];
                  a[i]=a[j];
                  a[j]=t;
              }
          }
      }
      if(n>=3)
      {
          System.out.print(a[n-3]);
      }
      else
      {
          System.out.printf("It is not possible");
      }
    }
}