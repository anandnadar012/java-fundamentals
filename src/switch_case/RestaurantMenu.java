package switch_case;
import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Menu-------:");
        System.out.println("1 → Burger   - ₹120");
        System.out.println("2 → Pizza    - ₹250");
        System.out.println("3 → Sandwich - ₹100");
        System.out.println("4 → Pasta    - ₹180");
        System.out.println("5 → Coffee   - ₹80");
        System.out.println();

        System.out.print("Enter menu number (1-5): ");
        int menuNumber = sc.nextInt();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        int price;
        int total;

        switch (menuNumber) {
            case 1:
                price = 120;
                total = price * qty;
                System.out.println("Item: Burger");
                System.out.println("Total bill = ₹" + total);
                break;
            case 2:
                price = 250;
                total = price * qty;
                System.out.println("Item: Pizza");
                System.out.println("Total bill = ₹" + total);
                break;
            case 3:
                price = 100;
                total = price * qty;
                System.out.println("Item: Sandwich");
                System.out.println("Total bill = ₹" + total);
                break;
            case 4:
                price = 180;
                total = price * qty;
                System.out.println("Item: Pasta");
                System.out.println("Total bill = ₹" + total);
                break;
            case 5:
                price = 80;
                total = price * qty;
                System.out.println("Item: Coffee");
                System.out.println("Total bill = ₹" + total);
                break;

            default:
                System.out.println("Invalid menu number");
        }

        sc.close();
    }
}