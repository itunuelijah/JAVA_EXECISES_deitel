package shopCart;
import java.math.BigDecimal;
import java.util.ArrayList;
public class Cart {
    private String ownerName;
    private ArrayList<Item> items = new ArrayList<>();

    public Cart(String ownerName) {
        this.ownerName = ownerName;
    }

    public void addItemToCart(Item item) {
        this.items.add(item);
    }

    public BigDecimal calculateTotalPrice() {
//        int  total = 0; if total is int. bigDecimal has special initialization
        BigDecimal total = BigDecimal.ZERO;
        for (Item item : items) {
//            total += item.calculateTotal(); THIS IS FOR INT VARIABLE
           total = total.add(item.calculateTotal());
        }
          return total;
    }

    public BigDecimal calculateVat(int percentage) {
        return calculateTotalPrice();
    }

    @Override
    public String toString() {
        String stringToReturn = "";

        for (Item item : items) {
            stringToReturn += item + "\n";
        }
        return stringToReturn;
    }
}






