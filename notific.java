class mobile {
    void send()
    {
        System.out.println("Sending message");
    }
}
class email extends mobile
{
    void send()
    {
        System.out.println("Sending email");
    }
}
class sms extends mobile
{
    void send()
    {
        System.out.println("Sending sms");
    }
}
class whatsapp extends mobile
{
    void send()
    {
        System.out.println("Sending whatsapp message");
    }
}
public class notific {
    public static void main(String[] args) {
        mobile m;
        m=new mobile();
        m.send();
        m=new email();
        m.send();
        m=new sms();
        m.send();
        m=new whatsapp();
        m.send();
    }
}