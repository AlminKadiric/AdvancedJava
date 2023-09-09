package dao;

import java.util.List;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product();
        ProductDao productDao = new ProductDao();

       List<Product> productList =productDao.getAll();
       Product proizvod=productDao.get(1);
        System.out.println(proizvod);
        productList.stream().filter(product1 -> product1.getQuantityInStock()>20).forEach(product1 -> System.out.println(product1));
      // productList.stream().forEach(product1 -> System.out.println(product1));
    }

}
