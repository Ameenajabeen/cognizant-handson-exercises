package MODULE1.StrategyPatternExample;

public class StrategyPatternTest {

    public static void main(String[] args) {

        // Credit Card Payment
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012");

        PaymentContext context = new PaymentContext(creditCard);

        context.executePayment(5000);

        // Switch to PayPal Payment
        PaymentStrategy paypal = new PayPalPayment("ameena@gmail.com");

        context.setPaymentStrategy(paypal);

        context.executePayment(2500);
    }
}