package shopCart;

import java.math.BigDecimal;

public class Item {

    private int quantity;
    private BigDecimal price;
    pr ivate String name;

    public Item(String name, BigDecimal price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public BigDecimal calculateTotal() {
        return price.multiply(BigDecimal.valueOf( quantity));
    }

    @Override
    public String toString() {
        String toStringItem = (name + "\t\t\t" + price + "\t\t" + quantity + "\t\t" + calculateTotal());
        return toStringItem;
    }

}
