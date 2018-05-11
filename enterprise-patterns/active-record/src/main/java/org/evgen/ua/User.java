package org.evgen.ua;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class User {

    //Somehow injects
    private static Connection connection;

    private static final AtomicInteger ID_SEQUENCE = new AtomicInteger(0);

    private int id;
    private String email;
    private String password;

    public static User register(String email, String password) throws SQLException {
        Optional<User> user = loadByEmail(email);
        if (user.isPresent()) {
            throw new IllegalArgumentException();
        }
        User newUser = new User();
        newUser.setId(ID_SEQUENCE.incrementAndGet());
        newUser.setEmail(email);
        newUser.setPassword(password);
        newUser.save();
        return newUser;
    }

    public static void login(String email, String password) {
        Optional<User> user = loadByEmail(email);
        if (!user.isPresent()) {
            throw new IllegalArgumentException();
        }
        if (!user.get().getPassword().equals(password)){
            throw new IllegalArgumentException();
        }
    }

    public static Optional<User> loadByEmail(String email) {
        //execute query, parse result set
        return Optional.empty();
    }

    public void save() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO user(id,email,password) VALUES(?,?,?)"
        );
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, email);
        preparedStatement.setString(3, password);
        preparedStatement.execute();
    }

    public void update() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "UPDATE user SET email=?, password=? WHERE id=?"
        );
        preparedStatement.setString(1, email);
        preparedStatement.setString(2, password);
        preparedStatement.setInt(3, id);
        preparedStatement.execute();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(email, user.email) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, email, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
