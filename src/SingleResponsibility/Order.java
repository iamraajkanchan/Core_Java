package SingleResponsibility;

public class Order {
    private final int orderId;
    public final double amount;
    private final String productName;
    public final String customerName;

    public Order(int orderId, double amount, String productName, String customerName) {
        this.orderId = orderId;
        this.amount = amount;
        this.productName = productName;
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void showDetails() {
        System.out.println("Customer Name: " + customerName + " ,Product Name: " + productName + " ,Amount: " + amount + " ,Order ID: " + orderId);
    }
}
