import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
        sc.close();
        
    }
}