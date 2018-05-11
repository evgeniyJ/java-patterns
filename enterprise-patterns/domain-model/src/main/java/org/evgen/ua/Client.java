package org.evgen.ua;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Client {

    public final String name;
    public final String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void sendEmail(String text) {
        //sending email to client
        System.out.println(
                String.format("Sending email message '%1s' to client email %2s", text, this.email)
        );
    }

    public static List<Client> loadClients() {
        //logic with database access in done in another place!
        return Arrays.asList(
                new Client("Yevheniy", "example@gmail.com"),
                new Client("Vlad", "test@gmail.com")
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) &&
                Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, email);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
