package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        Car car1 = new Car("BMW", 1);
        Car car2 = new Car("BMW", 3);
        Car car3 = new Car("BMW", 5);
        Car car4 = new Car("BMW", 7);
        Car car5 = new Car("BMW", 6);

        User user1 = new User("User1", "Lastname1", "user1@mail.ru", car1);
        User user2 = new User("User2", "Lastname2", "user2@mail.ru", car2);
        User user3 = new User("User3", "Lastname3", "user3@mail.ru", car3);
        User user4 = new User("User4", "Lastname4", "user4@mail.ru", car4);

        userService.add(user1);
        userService.add(user2);
        userService.add(user3);
        userService.add(user4);

        User user5 = new User("User5", "Lastname5", "user5@mail.ru", car5);

        System.out.println("First Name = " + user5.getFirstName());
        System.out.println("Last Name = " + user5.getLastName());
        System.out.println("Email = " + user5.getEmail());

        context.close();
    }
}
