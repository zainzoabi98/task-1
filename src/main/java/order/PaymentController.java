package order;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/api/payment")
public class PaymentController {

    // Mock database to store payments
    private List<Payment> payments;

    // Endpoint to process payment
    @RequestMapping("/pay")
    public String pay(@RequestBody Order order) {
        // Process payment logic
        return "Payment processed successfully";
    }

    // Endpoint to initiate deposit
    @PostMapping("/initiateDeposit")
    public String initiateDeposit() {
        // Initiate deposit logic
        return "Deposit initiated successfully";
    }

    // Endpoint to cancel payment
    @DeleteMapping("/cancelPay")
    public String cancelPay() {
        // Cancel payment logic
        return "Payment cancelled successfully";
    }

    // Endpoint to confirm successful payment
    @PutMapping("/successPay/{paymentId}/{payerId}")
    public String successPay(@PathVariable String paymentId, @PathVariable String payerId) {
        // Confirm successful payment logic
        return "Payment successfully confirmed for paymentId: " + paymentId + " and payerId: " + payerId;
    }

    // Endpoint to get payments by order
    @GetMapping("/getPaymentByOrder")
    public List<Payment> getPaymentByOrder(@RequestBody Order order) {
        // Get payments by order logic
        return payments; // Return list of payments (mocked)
    }

    // Endpoint to get all orders by price less than
    @GetMapping("/getAllOrdersByPriceLessThan/{price}")
    public Optional<Order> getAllOrdersByPriceLessThan(@PathVariable double price) {
        // Get all orders by price less than logic
        return Optional.empty(); // Return optional of order (mocked)
    }

    // Endpoint to get all payments by payment method
    @GetMapping("/getAllPaymentsByPaymentMethod/{method}")
    public List<Payment> getAllPaymentsByPaymentMethod(@PathVariable String method) {
        // Get all payments by payment method logic
        return payments; // Return list of payments (mocked)
    }
}
