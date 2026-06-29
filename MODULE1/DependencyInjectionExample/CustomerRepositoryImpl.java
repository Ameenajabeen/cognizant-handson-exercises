package MODULE1.DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        if (id == 101) {
            return "Ameena Jabeen";
        } else if (id == 102) {
            return "Afreen";
        }

        return "Customer Not Found";
    }
}
