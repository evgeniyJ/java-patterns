package org.evgen.ua;

import java.math.BigDecimal;

public class Shop {

    public void addNewProduct(String name, BigDecimal price) {
        //here should be real logic but in one place
        System.out.println("Saving new product " + name + " for price " + price);
        System.out.println("Loading all client in order to send them notification");
        System.out.println("Sending notification to clients about new product");
    }
}
