package MODULE1.AdapterPatternExample;

//bridge class that adapts PayPalPayment to PaymentProcessor interface
public class PayPalAdapter implements PaymentProcessor {
    private PayPalPayment payPalPayment;

    public PayPalAdapter(PayPalPayment payPalPayment) {
        this.payPalPayment = payPalPayment;
    }

    @Override
    public void ProcessPayment(double amount) {
        payPalPayment.makePayment(amount);
    }
}
