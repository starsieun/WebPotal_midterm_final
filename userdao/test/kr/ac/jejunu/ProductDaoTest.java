package kr.ac.jejunu;

import org.junit.Test;

import java.sql.SQLException;
import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ProductDaoTest {
    @Test
    public void get() throws SQLException, ClassNotFoundException {
        Long id = 1L;
        String title = "제주감귤";
        Integer price = 15000;

        ProductDao productDao = new ProductDao();

        Product product = productDao.get(id);
        assertThat(id, is(product.getId()));
        assertThat(title, is(product.getTitle()));
        assertThat(price, is(product.getPrice()));
    }

    @Test
    public void add() throws SQLException, ClassNotFoundException {

        Long id = Long.valueOf(new Random().nextInt());
        String title = "한라봉";
        int price = 6000;

        Product product = new Product();

        product.setId(id);
        product.setTitle(title);
        product.setPrice(price);

        ProductDao productDao = new ProductDao();

        productDao.add(product);

        Product addedProduct = productDao.get(id);

        assertThat(id,is(addedProduct.getId()));
        assertThat(title,is(addedProduct.getTitle()));
        assertThat(price,is(addedProduct.getPrice()));


    }
}
