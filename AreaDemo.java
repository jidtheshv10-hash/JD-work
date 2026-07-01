import java.util.Scanner;

class Area {
    void calculateArea(int side) {
        System.out.println("Area of Square = " + (side * side));
    }
    void calculateArea(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
    void calculateArea(double radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

public class AreaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area a = new Area();
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        a.calculateArea(side);
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();
        a.calculateArea(length, breadth);
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        a.calculateArea(radius);

        sc.close();
    }
}