import java.util.*; 
public class codemind
{
    public static void main(String args[]) 
    {         
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float c=0;
        for(float i=1;i<=a;i++)
        {
            c=c+(1/i);
        }
        System.out.printf("%.2f",c);     
    } 
}