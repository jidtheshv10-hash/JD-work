 class employe {
    void work()
    {
        System.out.println("employee is working");
    }
    
}
class developer extends employe
{
    void developer()
    {
        System.out.println("developer is developing and he is the employee");     
    }
    void code()
    {
        System.out.println("he is coding");
    }
}
public class employee
{
    public static void main(String []args)
    {
        developer d=new developer();
        d.work();
        d.developer();
        d.code();
    }
}
