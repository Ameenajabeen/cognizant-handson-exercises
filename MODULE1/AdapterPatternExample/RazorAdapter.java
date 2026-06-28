package MODULE1.AdapterPatternExample;

public class RazorAdapter implements PaymentProcessor {
    private RazorPayPayment razorPayPayment;

    public RazorAdapter(RazorPayPayment razorPayPayment) {
        this.razorPayPayment = razorPayPayment;
    }

    @Override
    public void ProcessPayment(double amount) {
        razorPayPayment.makeRazorPayPayment(amount);
    }
}
