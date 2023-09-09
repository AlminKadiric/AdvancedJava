package jdbc;

import java.sql.SQLException;
import java.util.List;

public class DBDemo {
    public static void main(String[] args) throws SQLException {
        CustomerMySQLReader customerMySQLReader = new CustomerMySQLReader();
        List<Customer> customerList = customerMySQLReader.loadCustomers();
        customerList.stream().forEach(customer -> System.out.println(customer));



    }
}
