package SingleResponsibility;

public class Calculation extends Order {
    private double balance = 100.0;

    /*
    Code is not working for static method

    private static double amount = 0.0;
    private static String customerName = "";

    */

    /*
    Code is not working for static method

    public Calculation(int orderId, double amount, String productName, String customerName) {
        super(orderId, amount, productName, customerName);
        Calculation.amount = amount;
        Calculation.customerName = customerName;
    }

    public static void printBalance() {
        if (Calculation.balance > Calculation.amount) {
            Calculation.balance = Calculation.balance - Calculation.amount;
            System.out.println("Balance of " + Calculation.customerName + " is " + Calculation.balance);
        }
    }

   */

    public Calculation(int orderId, double amount, String productName, String customerName) {
        super(orderId, amount, productName, customerName);
    }

    public void printBalance() {
        if (balance > amount) {
            balance = balance - amount;
            System.out.println("Balance of " + customerName + " is " + balance);
        } else {
            System.out.println("You do not have enough amount in your wallet");
        }
    }
}
