class animal
{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends animal
{
    void sound()
    {
        System.out.println("Dog barks");
    }
    void show()
    {

        sound();
        super.sound();
    }
}
public class sup
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.show();
    }
}