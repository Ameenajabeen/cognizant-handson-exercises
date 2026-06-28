package MODULE1.AdapterPatternExample;

//bridge class to adapt RazorPayPayment to PaymentProcessor interface
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
