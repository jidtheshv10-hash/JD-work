package uncheck;

public class nulp {
    public static void main(String[] args) {
        try {
            String name= null;
            System.out.println(name.length());
        } catch (Exception e) {
            System.out.println("Null pointer exception occurred");
        }
    }
    
}
