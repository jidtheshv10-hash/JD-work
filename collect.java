
import java.util.*;

public class collect {
    public static void main(String [ ] args)
    {
        Collection<String>name=new ArrayList<>();
        name.add("Ravi");
        name.add("Kumar");
        name.add("Priya");
        System.out.println(name);
        System.out.println(name.size());
        System.out.println(name.contains("Kumar"));
        name.remove("Priya");
        System.out.println(name);

    }
    
}
