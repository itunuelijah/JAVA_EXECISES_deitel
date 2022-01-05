package chapter3.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("12", "book", 2, 30);
        Invoice invoice2 = new Invoice("15", "pen", 5, 15);
        Invoice invoice3 = new Invoice("20", "pencil", 10, 25);

        System.out.println("This is an Invoice for the item(s) sold:" + "\n");
        System.out.println(invoice1.getNumber()+"\t"+invoice1.getDescription()+
                "\t"+invoice1.getPrice()+"\t"+invoice1.getInvoiceAmount());

        System.out.println(invoice2.getNumber()+"\t"+invoice2.getDescription()+
                "\t  "+invoice2.getPrice()+"\t"+invoice2.getInvoiceAmount());

        System.out.println(invoice3.getNumber()+"\t"+invoice3.getDescription()+
                "\t"+invoice3.getPrice()+"\t"+invoice3.getInvoiceAmount());

        System.out.println("\n");

        double total = invoice1.getInvoiceAmount()+invoice2.getInvoiceAmount()+
                invoice3.getInvoiceAmount();
        System.out.println("TOTAL:" +total+ "\n\n");
    }
}
