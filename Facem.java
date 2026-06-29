interface Father {
    void study();

}
interface Mother
{
    void clean();
}
class Child implements Father,Mother
{
    public void study()
    {
        System.out.println("He is studying");
    }
    public void clean()
    {
        System.out.println("He is cleaning");
    }
}
public class facem {
    public static void main(String[] args) {
        Child c=new Child();
        c.study();
        c.clean();
    }
}