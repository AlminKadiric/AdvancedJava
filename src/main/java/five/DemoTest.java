package five;

import dao.Product;
import dao.ProductDao;
import dao.ProductDemo;

import java.net.CookieHandler;
//Singleton Pattern


public class DemoTest {
    public static void main(String[] args) {
        ConnectionPool cp1 = ConnectionPool.getINSTANCE();
        ConnectionPool cp2 = ConnectionPool.getINSTANCE();
        System.out.println(cp1.hashCode());
        System.out.println(cp2.hashCode());
        ProductDao productDao = new ProductDao();
        productDao.get(1);
        productDao.get(1);
        productDao.get(1);
        productDao.get(1);
        productDao.get(1);
        productDao.get(1);
        productDao.get(1);
        productDao.get(1);
        productDao.get(1);
        productDao.get(1);
        for (int i = 1; i <= 12; i++) {
            Product product = productDao.get(i);
            System.out.println(product);


        }





    }
}
