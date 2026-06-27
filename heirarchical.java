class animal {
    void eat()
    {
        System.out.println("eats ");
    }
    
}
class dog extends animal
{
    void bark()
    {
        System.out.println("barks");     
    }
}

class cow extends animal   
    {
   void milk()
    {
        System.out.println("mooo");
    }
}

public  class heirarchical
{
    public static void main(String []args)
    {
        cow c=new cow();
        c.eat();
        c.milk();
        dog d=new dog();
        d.eat();
        d.bark();
    }
}
