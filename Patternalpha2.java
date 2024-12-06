import java.util.*;
public class Patternalpha2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<=5;j++)
            {
                System.out.print((char)(64+j)+" ");

            }
        System.out.println();
        }
    }
}