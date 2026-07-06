package Star;

public class mset 
{
    public static void main(String [ ]args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                for(int k=1;k<=j;k++)
                {
                    for(int m=1;m<=k;m++)
                    
                    {
                        for(int n=1;n<=m;n++)
                        {
                            System.out.print("* ");
                        }
                        System.out.print("*");
                    }
                    System.out.print(" ");
                }
                {
                    System.out.print("* ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
