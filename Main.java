import java.util.ArrayList;
import java.util.Scanner;

class FoodItem {
    private String name;
    private int price;

    public FoodItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
class MainCourse extends FoodItem {
    public MainCourse(String name, int price) {
        super(name, price);
    }
}

class Snack extends FoodItem {
    public Snack(String name, int price) {
        super(name, price);
    }
}

class Drink extends FoodItem {
    public Drink(String name, int price) {
        super(name, price);
    }
}

class Dessert extends FoodItem {
    public Dessert(String name, int price) {
        super(name, price);
    }
}

class Order {
    private FoodItem item;
    private int quantity;

    public Order(FoodItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public int getAmount() {
        return item.getPrice() * quantity;
    }
    public void displayOrder(){
        System.out.println(item.getName()+" x "+quantity+" = Rs "+getAmount());
    }
}

class FoodOrderingSystem {
    private ArrayList<Order> orders = new ArrayList<>();
    private int totalAmount = 0;

    public void addOrder(FoodItem item, int quantity) {
        Order order = new Order(item, quantity);
        orders.add(order);
        totalAmount += order.getAmount();

        System.out.println("Added to cart:");

        order.displayOrder();
    }

    public void displayBill() {
        if(orders.isEmpty()){
    System.out.println("No items in cart.");
    return;
}
int orderId=(int)(Math.random()*9000)+1000;
        System.out.println();
        System.out.println("Your order is placed successfully.....");
        System.out.println("Thank you for your order!");
        System.out.println();
        System.out.println("=================================");
        System.out.println("           ORDER BILL");
        System.out.println("=================================");
        System.out.println("Order ID : WOW"+orderId);
        System.out.println("=================================");

        for (Order order : orders) {
            order.displayOrder();
        }
        
        System.out.println("---------------------------------");
        System.out.println("Total Amount: Rs" + totalAmount);
        System.out.println("=================================");
        System.out.println();
        System.out.println("Make your taste buds ready for the feast!!!!");
        System.out.println("#Come Hungry Leave Happy!!!!");
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to WOW CART!!!");
        System.out.println();
        System.out.println("#Every craving deserves a WOW...");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        FoodOrderingSystem system = new FoodOrderingSystem();
        
        FoodItem burger = new MainCourse("Burger",120);
        FoodItem pizza = new MainCourse("Pizza",299);
        FoodItem briyani = new MainCourse("Biryani",250);
        FoodItem pasta = new MainCourse("Pasta",199);
        FoodItem friedrice = new MainCourse("Fried Rice",180);

        FoodItem frenchfries = new Snack("French Fries",99);
        FoodItem friedchicken = new Snack("Fried Chicken",229);
        FoodItem sandwich = new Snack("Sandwich",119);
        FoodItem nuggets = new Snack("Nuggets",150);
        FoodItem cookies = new Snack("Cookies",69);

        FoodItem cococola = new Drink("Coca-Cola",49);
        FoodItem pepsi = new Drink("Pepsi",49);
        FoodItem sprite = new Drink("Sprite",49);
        FoodItem coffee = new Drink("Coffee",89);
        FoodItem tea = new Drink("Tea",49);

        FoodItem icecream = new Dessert("Ice Cream",99);
        FoodItem chocolatecake = new Dessert("Chocolate Cake",149);
        FoodItem browine = new Dessert("Brownie",130);
        FoodItem cheesecake = new Dessert("Cheese Cake",300);
        FoodItem donut = new Dessert("Donut",80);
        
        FoodItem[] menu = {
    burger,pizza,briyani,pasta,friedrice,
    frenchfries,friedchicken,sandwich,nuggets,cookies,
    cococola,pepsi,sprite,coffee,tea,
    icecream,chocolatecake,browine,cheesecake,donut
};
        char more='y';

        do {
            System.out.println("=================================");
            System.out.println("        MAIN COURSE");
            System.out.println("=================================");
            System.out.println("1. Burger      - 120rs");
            System.out.println("2. Pizza       - 299rs");
            System.out.println("3. Biryani     - 250rs");
            System.out.println("4. Pasta       - 199rs");
            System.out.println("5. Fried Rice  - 180rs");
            System.out.println("=================================");
            System.out.println("            SNACKS");
            System.out.println("=================================");
            System.out.println("6.French Fries  - 99rs");
            System.out.println("7.Fried Chicken - 229rs");
            System.out.println("8.Sandwich      - 119rs");
            System.out.println("9.Nuggets       - 150rs");
            System.out.println("10.Cookies      - 69rs");
            System.out.println("=================================");
            System.out.println("            DRINKS");
            System.out.println("=================================");
            System.out.println("11.Coca-Cola - 49rs");
            System.out.println("12.Pepsi     - 49rs");
            System.out.println("13.Sprite    - 49rs");
            System.out.println("14.Coffee    - 89rs");
            System.out.println("15.Tea       - 49rs");
            System.out.println("=================================");
            System.out.println("            DESSERTS");
            System.out.println("=================================");
            System.out.println("16.Ice-Cream      - 99rs");
            System.out.println("17.Chocolate Cake - 149rs");
            System.out.println("18.Brownie        - 130rs");
            System.out.println("19.Cheese Cake    - Rs:300/per pac");
            System.out.println("20.Donut          - 80rs");
            System.out.println("21.Exit");
            System.out.print("Enter the food you would like to have:");
            int choice = sc.nextInt();
            if (choice == 21) {
                System.out.println("Enjoy your Day!!!");
                System.out.println();
                System.out.println("WOW CART!!!");
                System.exit(0);
            }

            if(choice>=1 && choice<=20){
    System.out.println("You have chosen " + menu[choice-1].getName()+"...");
}
else{
    System.out.println("Invalid Choice!");
    continue;
}

            System.out.print("How Much Do You Like To Have???:");
            int qty = sc.nextInt();
            if(qty<=0){
    System.out.println("Quantity should be greater than zero...");
    continue;
}

            system.addOrder(menu[choice-1], qty);
           
            System.out.print("Do you want to taste anything more interesting? (Y/N): ");
            more = sc.next().toUpperCase().charAt(0);

        } while (more == 'Y');
        System.out.print("Please Enter Your Number:");
        String num=sc.next();

if(num.length()!=10){
    System.out.println("Invalid Mobile Number");
    return;
}
        
system.displayBill();
    }
}
