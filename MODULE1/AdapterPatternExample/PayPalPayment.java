package MODULE1.AdapterPatternExample;

//third party payment gateway
public class PayPalPayment {
    public void makePayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
