package MODULE1.ObserverPatternExample;

public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Ameena");

        Observer webUser = new WebApp("Jabeen");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        stockMarket.setStockPrice("TCS", 3850.50);

        stockMarket.setStockPrice("Infosys", 1620.75);

        stockMarket.deregisterObserver(webUser);

        System.out.println("\nWeb User Unsubscribed");

        stockMarket.setStockPrice("Wipro", 510.25);
    }
}
