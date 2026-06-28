package MODULE1.AdapterPatternExample;

public class GoogleAdapter implements PaymentProcessor {
    private GooglePayment googlepayment;

    public GoogleAdapter(GooglePayment googlepayment) {
        this.googlepayment = googlepayment;
    }

    @Override
    public void ProcessPayment(double amount) {
        googlepayment.payWithGoogle(amount);
    }
}
