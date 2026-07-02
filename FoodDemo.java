class Food {
    private String foodName = "Pizza";
    private int price = 250;

    public String getFoodName() {
        return foodName;
    }

    public int getPrice() {
        return price;
    }
}

class Customer {
    private String customerName = "Rahul";

    public String getCustomerName() {
        return customerName;
    }
}

class Order {
    public void addFood(Food f) {
        System.out.println(f.getFoodName() + " Added");
    }

    public void removeFood(Food f) {
        System.out.println(f.getFoodName() + " Removed");
    }

    public void calculateBill(Food f) {
        System.out.println("Total Bill = " + f.getPrice());
    }
}

public class FoodDemo {
    public static void main(String[] args) {

        Customer c = new Customer();
        Food f = new Food();
        Order o = new Order();

        System.out.println("Customer: " + c.getCustomerName());

        o.addFood(f);
        o.calculateBill(f);
        o.removeFood(f);
    }
}