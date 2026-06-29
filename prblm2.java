abstract class Bank {
    abstract void interestRate();
    void bankinfo() {
        System.out.println("This is a bank");
    }
}
class sbi extends Bank {
    void interestRate() {
        System.out.println("SBI interest rate is 5%");
    }
}
class icici extends Bank {
    void interestRate() {
        System.out.println("ICICI interest rate is 6%");
    }
}
public class prblm2 {
    public static void main(String[] args) {
        sbi s = new sbi();
        s.interestRate();
        s.bankinfo();
        icici i = new icici();
        i.interestRate();
        i.bankinfo();
    }
}
