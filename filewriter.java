import java.io.FileWriter;
import java.io.IOException;
public class filewriter {
    public static void main(String[] args) {
    try {
        FileWriter writer=new FileWriter("C:\\Users\\Asus\\Documents\\file.txt");
        writer.write("Name : SIRI\n");
        writer.write("Age : 50\n");
        System.out.println("Data written Successfully");


    }
    catch (IOException e)
    {
        System.out.println("Error Writng file.");
    }
}
}