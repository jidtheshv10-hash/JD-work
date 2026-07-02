class food
{
    void taste()
    {
        System.out.println("Food taste good");
    }
}
public class anony
{
    public static void main(String args[])
    {
        food f = new food();
        {
            void taste()
            {
                System.out.println("Food taste bad");
            }
        };
        f.taste();
    }
}