package MODULE1.AdapterPatternExample;

//third party payment gateway
public class GooglePayment {
    public void payWithGoogle(double amount) {
        System.out.println("Processing Google payment of $" + amount);
    }
}
