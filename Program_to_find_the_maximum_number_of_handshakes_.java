import java.io.*;
import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
      int n,hs=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(int i=n-1;i>=1;i--)
      hs+=i;
      System.out.println(hs);
    }
}