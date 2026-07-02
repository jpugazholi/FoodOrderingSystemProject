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

    public void displayOrder() {
        System.out.println(item.getName() + " x " + quantity + " = Rs" + getAmount());
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
        System.out.println();
        System.out.println("Your order is placed successfully.....");
        System.out.println("Thank you for your order!");
        System.out.println();
        System.out.println("=================================");
        System.out.println("           ORDER BILL");
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
        System.out.println("#Every cravings deservs a WOW...");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        FoodOrderingSystem system = new FoodOrderingSystem();
        
        FoodItem burger = new FoodItem("Burger", 120);
        FoodItem pizza = new FoodItem("Pizza", 299);
        FoodItem briyani = new FoodItem("Briyani", 250);
        FoodItem pasta = new FoodItem("Pasta",199 );
        FoodItem friedrice = new FoodItem("Friedrice", 180);
        FoodItem frenchfries = new FoodItem("FrenchFries",99 );
        FoodItem friedchicken = new FoodItem("FriedChicken",229 );
        FoodItem sandwich = new FoodItem("Sandwich",119 );
        FoodItem nuggets = new FoodItem("Nuggets",150 );
        FoodItem cookies = new FoodItem("Cookies",69 );
        FoodItem cococola = new FoodItem("Cococola",49 );
        FoodItem pepsi = new FoodItem("Pepsi",49 );
        FoodItem sprite = new FoodItem("Sprite",49 );
        FoodItem coffee = new FoodItem("Coffee",89 );
        FoodItem tea = new FoodItem("Tea",49 );
        FoodItem icecream = new FoodItem("Icecream",99 );  
        FoodItem chocolatecake = new FoodItem("ChocolateCake",149);
        FoodItem browine = new FoodItem("Browine",130 );
        FoodItem cheesecake = new FoodItem("Cheesecake", 300);
        FoodItem donut = new FoodItem("Donut", 80);

       

        char more='y';

        do {
            System.out.println("=================================");
            System.out.println("        MAIN COURSE");
            System.out.println("=================================");
            System.out.println("1. Burger      - 120rs");
            System.out.println("2. Pizza       - 299rs");
            System.out.println("3. Briyani     - 250rs");
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
            System.out.println("19.Chease Cake    - Rs:300/per pac");
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

            switch (choice) {
                case 1:
                    System.out.println("You Have Choosen burger...");
                    break;
                case 2:
                    System.out.println("You Have Choosen pizza...");
                    break;
                case 3:
                    System.out.println("You Have Choosen briyani...");
                    break;
                case 4:
                    System.out.println("You Have Choosen pasta...");
                    break;
                case 5:
                    System.out.println("You Have Choosen fried rice...");  
                    break;
                case 6:
                    System.out.println("You Have Choosen french fries...");
                    break;
                case 7:
                    System.out.println("You Have Choosen fried chicken...");
                    break;
                case 8:
                    System.out.println("You Have Choosen sandwich...");
                    break;
                case 9:
                    System.out.println("You Have Choosen nuggets...");
                    break;
                case 10:
                    System.out.println("You Have Choosen cookies...");
                    break;
                case 11:
                    System.out.println("You Have Choosen coco...");
                    break;
                case 12:
                    System.out.println("You Have Choosen pepsi...");
                    break;
                case 13:
                    System.out.println("You Have Choosen sprite...");
                    break;
                case 14:
                    System.out.println("You Have Choosen coffee...");
                    break;
                case 15:
                    System.out.println("You Have Choosen tea...");
                    break;
                case 16:
                    System.out.println("You Have Choosen icecream...");
                    break;
                case 17:
                    System.out.println("You Have Choosen chocolate cake...");
                    break;
                case 18:
                    System.out.println("You Have Choosen browine...");
                    break; 
                case 19:  
                    System.out.println("You Have Choosen cheese cake...");
                    break;
                case 20:  
                    System.out.println("You Have Choosen donut...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    System.exit(0);
                }

            System.out.print("How Much Do You Like To Have???:");
            int qty = sc.nextInt();

            switch (choice) {
                case 1:
                    system.addOrder(burger, qty);
                    break;
                case 2:
                    system.addOrder(pizza, qty);
                    break;
                case 3:
                    system.addOrder(briyani, qty);
                    break;
                case 4:
                    system.addOrder(pasta, qty);
                    break;
                case 5:
                    system.addOrder(friedrice, qty);
                    break;
                case 6:
                    system.addOrder(frenchfries, qty);
                    break;
                case 7:
                    system.addOrder(friedchicken, qty);
                    break;
                case 8:
                    system.addOrder(sandwich, qty);
                    break;
                case 9:
                    system.addOrder(nuggets, qty);
                    break;
                case 10:
                    system.addOrder(cookies, qty);
                    break;
                case 11:
                    system.addOrder(cococola, qty);
                    break;
                case 12:
                    system.addOrder(pepsi, qty);
                    break;
                case 13:
                    system.addOrder(sprite, qty);
                    break;
                case 14:
                    system.addOrder(coffee, qty);
                    break;
                case 15:
                    system.addOrder(tea, qty);
                    break;
                case 16:
                    system.addOrder(icecream, qty);
                    break;
                case 17:
                    system.addOrder(chocolatecake, qty);
                    break;
                case 18:
                    system.addOrder(browine, qty);
                    break;
                case 19:
                    system.addOrder(cheesecake, qty);
                    break;
                case 20:
                    system.addOrder(donut, qty);
                    break;
                
                default:
                    System.out.println("Invalid Choice!");
                    continue;
            }
           
            System.out.print("Do you want to taste anything more intresting? (Y/N): ");
            more = sc.next().toUpperCase().charAt(0);

        } while (more == 'Y');
        System.out.print("Please Enter Your Number:");
        int num=sc.nextInt();

        system.displayBill();
    }
}