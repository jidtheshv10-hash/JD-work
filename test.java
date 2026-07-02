class person
{
    String name="Rahul";
}
class child extends person
{
    String name="Kumar";
    void display()
    {
        System.out.println("Student name : " + name);
        System.out.println("Person name : " + super.name);
    }
}
public class test
{
    public static void main(String args[])
    {
        child c = new child();
        c.display();
    }
}