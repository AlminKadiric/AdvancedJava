package dao;

import jdbc.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao implements Dao<Customer> {
    @Override
    public void create(Customer entity) {

    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customerList =new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from customer");
            while (resultSet.next()){
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

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return customerList;
    }

    @Override
    public Customer get(long primaryKey) {
        Customer customer = new Customer();
        try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)){
            PreparedStatement preparedStatement = connection.prepareStatement("Select * from customer where customerID=?");
            preparedStatement.setLong(1,primaryKey);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {


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
            }



        }catch (SQLException e){
            System.err.println(e.getMessage());


        }

        //Select * from customer where customerID=?
        return customer;
    }

    @Override
    public Customer update(Customer entity) {
        return null;
    }

    @Override
    public void delete(Customer entity) {

    }
}
