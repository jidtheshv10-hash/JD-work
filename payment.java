interface paymt {
    void pay();
}
class upi implements paymt{
    public void upi()
    {
        System.out.println("Method is upi");
    }
}
class card implements paymt
{
    public void card()
    {
        System.out.println("Method is card ");
    }
}
class cash implements paymt{
    public void cash()
    {
        System.out.println("Method is cash ");
    }
}

public class payment
{
    public static void main(String[] args) {
        cash c= new cash();
        c.cash();
        upi u= new upi();
        u.upi();
        card d= new card();
        d.card();
    }
}