import java.util.LinkedList;

public class linkedlist1 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Orange");
        list.add("Mango");

        list.addFirst("Banana");

        list.addLast("Grapes");

        System.out.println(list);

        list.removeFirst();

        list.removeLast();

        System.out.println(list);
    }
} 
