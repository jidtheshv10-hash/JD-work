class Student {
    String name;
    int age;
    Student() {
        name = "h";
        age = 10;
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("------------");
    }
}
public class const {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("i", 19);
        Student s3 = new Student("llo", 20);
        s1.display();
        s2.display();
        s3.display();
    }
}