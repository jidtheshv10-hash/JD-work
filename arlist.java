import java.util.*;

public class arlist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("mango");
        list.add("banana");
        System.out.println("List: " + list);
        System.out.println("First fruit :" + list.get(0));
        list.set(1, "banana");
        System.out.println("After set: " + list);
        list.remove("Apple");
        System.out.println("After remove :"+list);
        System.out.println("Size :"+list.size());
    }
}