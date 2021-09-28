package shopCart;
/**
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Whose cart is this?");
        String name = scanner.next();
        Cart newCart = new Cart(name);
        String response;

        do {
            System.out.println(" What did they buy?");
            String itemName = scanner.next();
            System.out.println(" How much per pieces?");
            BigDecimal itemPrice = scanner.nextBigDecimal();
            System.out.println(" How many did they buy?");
            int itemQuantity = scanner.nextInt();
            System.out.println(" Anything else?");
            response = scanner.next();
        while (response.equalsIgnoreCase("yes"));


        System.out.print(cart);
        System.out.print("your total bill is" + (String)(cart.calculateTotalPrice()));
        System.out.print("your total bill is" + (String) (any));
    }
}




        ..........

        def add_item_to_cart ():
            #anything_else = "yes"
            #while anything_else.lower() == "yes":
        item_name = input("wetin" + cart.owner_name + "buy? \n")
        item_price = float(input("how much " + item_name + "cost? \n"))
        item_quantity = int(input("how many " + item_name + " " + cart.owner - name + "buy\n"))
        item = Item(item_name, item_price, item_quantity)
        cart.add(item)
            #anything_else + input("Any thing else? \n")

        def add_item_to_cart ():
        anything_else = "yes"
        while anything_else.lower() == "yes":
        add_item - to - car()
        anything_else = input("anything else? \n").lower()
        print




        if __name__ == '__main__':
        set_up_cart()
        add_items_to - cart()
        display_invoice()

    }

}
sss
        */