class shape {
    void draw()
    {
        System.out.println("drawing shape");

    }
    
}
class circle extends shape
{
    void area()
    {
        System.out.println("circle area ");     
    }

}
class square extends shape
{
    void rarea()
    {
        System.out.println("square area ");     
    }
}
public class heir2
{
    public static void main(String []args)
    {
        circle c=new circle();
        c.draw();
        c.area();
        square s=new square();
        s.draw();
        s.rarea();
    }
}