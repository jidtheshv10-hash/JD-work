import java.util.ArrayList;
public class ll2
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Mango");
        System.out.println("List : " + list);
        System.out.println("First Fruit : " + list.get(0));
        list.set(1, "Banana");
        System.out.println("After Set : " + list);
        list.remove("Apple");
        System.out.println("After Remove : " + list);
        System.out.println("Size : " + list.size());
    }
}