package org.evgen.ua;

import java.math.BigDecimal;
import java.util.List;

public class Shop {

    public void addNewProduct(String name, BigDecimal price) {
        Product product = new Product(name, price);
        product.save();
        List<Client> clients = Client.loadClients();
        String message = String.format(
                "New product %1s is now available in shop for price %2s $. Go and buy it!",
                product.name,
                product.price
        );
        clients.forEach(client -> client.sendEmail(message));
    }
}
