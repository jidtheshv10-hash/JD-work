import java.util.*;

public class list {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("mango");
        list.add("banana");

        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Get: " + list.get(1));

        list.set(1, "banana");
        System.out.println("After set: " + list);

        list.remove("apple");
        System.out.println("After remove: " + list);

        System.out.println("Contains mango: " + list.contains("mango"));
        System.out.println("Index: " + list.indexOf("mango"));

        System.out.println("Is Empty: " + list.isEmpty());

        list.clear();
        System.out.println("After clear: " + list);
    }
}