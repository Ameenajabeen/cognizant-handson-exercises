package MODULE1.AdapterPatternExample;

public class AdapterPatterntest {

    public static void main(String[] args) {

        PaymentProcessor paypal = new PayPalAdapter(new PayPalPayment());

        PaymentProcessor Google = new GoogleAdapter(new GooglePayment());

        PaymentProcessor razorpay = new RazorAdapter(new RazorPayPayment());

        paypal.ProcessPayment(1000);
        Google.ProcessPayment(2000);
        razorpay.ProcessPayment(3000);
    }
}
