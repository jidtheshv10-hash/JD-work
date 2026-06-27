class animal {
    void cat()
    {
        System.out.println("cat is animal");
    }
    
}
class mammal extends animal
{
    void dog()
    {
        System.out.println("dog is mammal and it is animal");     
    }
}

    class cow extends mammal    
    {
   void cow()
    {
        System.out.println("cow is mammal");
    }
}
public class mult2
{
    public static void main(String []args)
    {
        cow c=new cow();
        c.cat();
        c.dog();
        c.cow();
    }
}