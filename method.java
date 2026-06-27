
class vehicle {
    void car()
    {
        System.out.println("person");
    }    
}
class drive extends vehicle
{
    void drive()
    {
        System.out.println("driving car");     
    }
}
public class method
{
    public static void main(String args[])
    {
         drive d=new drive();
            d.car();
            d.drive();
}
}
