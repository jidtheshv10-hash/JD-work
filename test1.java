class school {
    String name="ABC School";
    class student extends school {
        String name="Arun";
        void display() {
            System.out.println("Student : " + name);
            System.out.println("School  : " + super.name);
        }
    }
    
}
public class test1 {
    public static void main(String args[]) {
        school.student s = new school().new student();
        s.display();
    }
}