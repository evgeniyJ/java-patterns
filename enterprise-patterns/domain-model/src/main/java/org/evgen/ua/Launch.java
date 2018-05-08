package org.evgen.ua;

import java.math.BigDecimal;

public class Launch {

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addNewProduct("iPhone SE", BigDecimal.valueOf(500));
    }
}
