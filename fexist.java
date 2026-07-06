import java.io.File;
public class fexist {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Asus\\Documents\\file.txt");
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }
    }
}