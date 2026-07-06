import java.util.ArrayList;

import java.util.*;
public class section1 {

    public static void main(String[] args) {
        ArrayList<String>list =new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("orange");
        Iterator<String> it =list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        } 

        

    }
}