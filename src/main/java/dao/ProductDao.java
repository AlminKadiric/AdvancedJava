package dao;

import com.mysql.cj.jdbc.ConnectionImpl;
import five.ConnectionPool;

import javax.swing.*;
import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductDao implements Dao<Product>{
    @Override
    public void create(Product entity) {

    }

    @Override
    public List<Product> getAll()  {
        List<Product> products = new ArrayList<>();
        try(Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD)){
            PreparedStatement preparedStatement = connection.prepareStatement("Select * from product");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Product product = new Product();
                int productID=resultSet.getInt("ProductID");
                product.setProductId(productID);
                String firstname = resultSet.getString("Name");
                product.setName(firstname);
                int quantityStock= resultSet.getInt("quantity_in_stock");
                product.setQuantityInStock(quantityStock);
                BigDecimal price = resultSet.getBigDecimal("Price");
                product.setUnitPrice(price);



                products.add(product);


            }


        }catch (SQLException e){
            System.err.println(e.getMessage());

        }
        return products;
    }

    @Override
    public Product get(long primaryKey) {

        try{
            ConnectionPool connectionPool = ConnectionPool.getINSTANCE();
            Connection connection = connectionPool.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("Select * from product where ProductID=?");
            connectionPool.releaseConnection(connection);
            preparedStatement.setLong(1,primaryKey);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                Product product = new Product();
                int productID=resultSet.getInt("ProductID");
                product.setProductId(productID);
                String firstname = resultSet.getString("Name");
                product.setName(firstname);
                int quantityStock= resultSet.getInt("quantity_in_stock");
                product.setQuantityInStock(quantityStock);
                BigDecimal price = resultSet.getBigDecimal("Price");
                product.setUnitPrice(price);
                return product;


            }


        }catch (SQLException e){
            System.err.println(e.getMessage());

        }
        return null;
    }

    @Override
    public Product update(Product entity) {
        return null;
    }

    @Override
    public void delete(Product entity) {

    }
}
