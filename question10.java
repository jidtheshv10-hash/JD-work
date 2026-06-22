public class question10 {
    public static void main(String[] args) {

        int n = 8;

        if((n & (n - 1)) == 0) {
            System.out.println(n + " is a Power of 2");
        } else {
            System.out.println(n + " is NOT a Power of 2");
        }
    }
}