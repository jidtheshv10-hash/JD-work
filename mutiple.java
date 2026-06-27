class grandfather{
    void land()
    {
        System.out.println("Land porperty ");
    }
    
}
class father extends grandfather
{
    void house()
    {
        System.out.println("house property ");     
    }
}
class son extends father
{
    void car()
    {
        System.out.println("car property ");     
    }
}
public class mutiple
{
    public static void main(String []args)
    {
        son s=new son();
        s.land();
        s.house();
        s.car();
    }
}
