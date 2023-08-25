package jdbc;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.spi.LocaleServiceProvider;

public class CustomerMySQLReader {
    public static final String URL = "jdbc:mysql://localhost:3306/my_first_db";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    public List<Customer> loadCustomers() throws SQLException {
        List<Customer> customerList = new ArrayList<>();

        String query = "SELECT * from customers";
        // ostvariti konekciju sa bazom......
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from customer");
        while (resultSet.next()) {
            Customer customer = new Customer();
            int customerId = resultSet.getInt("customerID");
            customer.setCustomerId(customerId);
            String firstname = resultSet.getString("First_name");
            customer.setFirstName(firstname);
            String lastname = resultSet.getString("Last_name");
            customer.setLastName(lastname);
            Date birthdate = resultSet.getDate("date");

            customer.setBirthdate(birthdate.toLocalDate());
            String phone = resultSet.getString("phone");
            customer.setPhone(phone);
            String address = resultSet.getString("address");
            customer.setAddress(address);
            String city = resultSet.getString("city");
            customer.setCity(city);
            String state = resultSet.getString("state");
            customer.setState(state);
            Integer points = resultSet.getInt("points");
            customer.setPoints(points);

            customerList.add(customer);


        }


        return customerList;

    }


}
