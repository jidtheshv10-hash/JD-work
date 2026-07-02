class oute
{
    int x=100;
    class inner
    {
        
        void display()
        {
            System.out.println("Outer class variable : "+x);
        }
    }
}
public class outer
{
    public static void main(String args[])
    {
        oute o=new outer();
        oute.inner i=o.new inner();
        i.display();
    } 
}