package MODULE1.DependencyInjectionExample;

public class DependencyInjectionTest {

    public static void main(String[] args) {

        // Create Repository
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject Repository into Service
        CustomerService service = new CustomerService(repository);

        // Use Service
        String customer = service.getCustomerById(101);

        System.out.println("Customer Name: " + customer);
    }
}
