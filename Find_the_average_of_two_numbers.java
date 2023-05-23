import java.io.*;
import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        int N,M;
        float sum,average;
    Scanner sc=new Scanner(System.in);
    N=sc.nextInt();
    M=sc.nextInt();
    sum=(float)N+M;
    average=(float)(N+M)/2;
    System.out.format("%.4f",average);
    }
}
