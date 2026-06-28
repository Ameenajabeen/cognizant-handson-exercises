package MODULE1.AdapterPatternExample;

//third party payment gateway
public class RazorPayPayment {
    public void makeRazorPayPayment(double amount) {
        System.out.println("Processing RazorPay payment of $" + amount);
    }
}
