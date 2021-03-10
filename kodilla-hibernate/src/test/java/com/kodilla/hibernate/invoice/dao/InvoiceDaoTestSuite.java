package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    void InvoiceDaoTestSuiteTest() {
        //Given
        Product product1 = new Product("Jablko");
        //When
        productDao.save(product1);
        int id = product1.getId();

        //Then
        assertNotEquals(1, id);

    }
    @Test
    void InvoiceDaoTestSuiteTest2() {
        //Given
        Item item1 = new Item(BigDecimal.valueOf(300), 4);
        Item item2 = new Item(BigDecimal.valueOf(200), 2);
        Item item3 = new Item(BigDecimal.valueOf(600), 1);
        Product product1 = new Product("Gruszka");
        Product product2 = new Product("Jablko");

        item1.setProduct(product1);
        item3.setProduct(product1);
        product1.getItem().add(item1);
        product1.getItem().add(item3);
        item2.setProduct(product2);
        product2.getItem().add(item2);


        //When
        productDao.save(product1);
        productDao.save(product2);
        //itemDao.save(item1);
        int id = product1.getId();

        //Then
        assertNotEquals(1, id);

    }

}
