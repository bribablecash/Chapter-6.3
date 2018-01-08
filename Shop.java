// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************
import java.util.ArrayList;
import java.util.Scanner;
public class Shop

{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList<Item>();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        while (keepShopping.equals("y")) 

            {
                System.out.print ("Enter the name of the item: ");
                itemName = scan.next();
                System.out.print ("Enter the unit price: ");
                itemPrice = scan.nextDouble();
                System.out.print ("Enter the quantity: ");
                quantity = scan.nextInt();
                // *** create a new item and add it to the cart
                Item thing = new Item(itemName, itemPrice, quantity);
                cart.add(thing);
                // *** print the contents of the cart object using println
                System.out.print ("Continue shopping (y/n)? ");
                keepShopping = scan.next();
            }
        checkOut(cart);

    }
   public static void checkOut(ArrayList<Item> yourCart) {
        Scanner scan = new Scanner(System.in);
        //You do NOT need a getter method (think about public instance variables)
        //Print the contents of the cart (you may use the toString() method
        for (int x = 0; x < yourCart.size(); x++) {
            Item temp = yourCart.get(x);
            System.out.println(temp.toString());
            
            System.out.print("Remove an Item (y/n)? ");
            String remove;
            remove = scan.next();
        
            if (remove.equals("y")) {
            yourCart.remove(x);
            }
        }
        //Ask the user if they would like to remove an item.  If yes, remove that item.
        //Print final total of items and final price (total)
        
        double totalPrice = 0;
        for (int x = 0; x < yourCart.size(); x++) {
            Item temp = yourCart.get(x);
            System.out.println(temp.name);
            System.out.println(totalPrice);
            totalPrice += temp.price;
            System.out.print(temp.quantity);
            
        }
}
}