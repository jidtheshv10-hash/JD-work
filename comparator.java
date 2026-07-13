import java.util.*;
class Student { 
    int id;
    String name;
    int marks;
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
}
class MarksComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.marks - s2.marks;   
    }
}
public class comparator {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Sachin", 90));
        list.add(new Student(2, "Rahul", 80));
        list.add(new Student(3, "Rohit", 70));
        list.add(new Student(4, "Virat", 60));
        list.add(new Student(5, "Dhoni", 50));
        Collections.sort(list, new MarksComparator());
        System.out.println("Sorted by Marks:");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}