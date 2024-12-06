import java.util.*;
public class Pattern2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<=5;j++)
            {
                System.out.print((char)(j+64)+" ");

            }
            System.out.println();
        }
    }
}