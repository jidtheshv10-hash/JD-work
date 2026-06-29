abstract class employee {
    abstract void calculatesalary();
    void company(){
        System.out.println("This is a company");
    }
}
class developer extends employee {
    void calculatesalary() {
        System.out.println("Developer salary is calculated");
    }
}
class manager extends employee
{
    void calculatesalary()
    {
        System.out.println("Manager salary is calculated");
    }
}
public class empsys {
    public static void main(String[] args) {
        developer d = new developer();
        d.calculatesalary();
        d.company();
        manager m = new manager();
        m.calculatesalary();
        m.company();
    }
}