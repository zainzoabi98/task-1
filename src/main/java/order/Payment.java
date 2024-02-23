package order;

import java.util.List;
import java.util.Objects;

public class Payment {
    private double totalAmount;
    private List<Order> orders;

    public Payment() {
    }

    public Payment(double totalAmount, List<Order> orders) {
        this.totalAmount = totalAmount;
        this.orders = orders;
    }

    // Getters and setters
    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    // Equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Double.compare(payment.totalAmount, totalAmount) == 0 && Objects.equals(orders, payment.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalAmount, orders);
    }
}
