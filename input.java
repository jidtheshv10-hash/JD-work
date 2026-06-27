import java.util.Scanner;
class animal
{
    String name;
    void showname()
    {
    System.out.println("Name : "+name);
}
}
class dog extends animal
{
    void input()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name of dog");
        name=sc.nextLine();
        
        
    }
    void bark()
    {
        System.out.println("barking");
    }

}

public class input 
{
    public static void main(String []args)
    {
        dog d=new dog();
        d.input();
        d.showname();
        d.bark();
    }
}