

class a {
    void display() {
        System.out.println("This is class A");
    }
    
}
class b extends a {
    void display() {
        System.out.println("This is class B");
    }
}
class c extends a {
    void display() {
        System.out.println("This is class C");
    }
}
class d extends b,c
{
    void display() {
        System.out.println("This is class D");
    }
}
public class extendkey {
    public static void main(String[] args) {
        
        d obj= new d();
        obj.display();
    }
}