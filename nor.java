class animal {
    String color="white";
    
}
class dog extends animal {
    String color="black";
    void display() {
        System.out.println("Child color : "+ color);
        System.out.println("Parent color : "+ super.color);
    }
}
public class nor {
    public static void main(String args[]) {
        dog d = new dog();
        d.display();
    }
}-----------------------------------------------