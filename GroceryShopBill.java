import java.util.Scanner;

public class GroceryShopBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of the item1: ");
        double price = sc.nextDouble();

        System.out.print("Enter the price item2 : ");
        double price2 = sc.nextDouble();

        System.out.print("Enter the price item3 : ");
        double price3 = sc.nextDouble();

        final double DISCOUNT = 0.10;

        double total = price + price2 + price3;

        double discountAmount = total * DISCOUNT;

        double finalAmount = total - discountAmount;

        
        System.out.println("Total bill amount: Rs:" + finalAmount);
    }
}

       