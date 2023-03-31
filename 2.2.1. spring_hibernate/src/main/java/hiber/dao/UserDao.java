package hiber.dao;

import hiber.model.User;

import javax.swing.*;
import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();

    User getUserByCar(String model, int series);
}
