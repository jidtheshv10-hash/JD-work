import java.io.FileReader;
public class ex
{
    public static void main(String []args)
    {
        try {
            FileReader f=new FileReader("day 2.txt");
            System.out.println("FILE OPENED SUCCESSFULLY");
        }
        catch( Exception e)
        {
            System.out.println("FILE NOT FOUND ");
        }
    }
}