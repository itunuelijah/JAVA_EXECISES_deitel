package chapter3.ModifiedAccount;

public class Account {
    private String name;
    private double balance;


    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0)
            this.balance = balance;

    }

    public void withdraw(double withdrawAmount) {
        if(withdrawAmount <= balance)
            balance = balance - withdrawAmount;
        else
            System.out.println("Withdrawal amount exceeded account balance. Enter another amount." );
}
    public double getBalance() {

        return balance;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

}
